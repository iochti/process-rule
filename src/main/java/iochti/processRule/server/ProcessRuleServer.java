package iochti.processRule.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import iochti.processRule.dto.ProcessRuleDTO;
import iochti.processRule.grpc.IdRequest;
import iochti.processRule.grpc.ProcessRule;
import iochti.processRule.grpc.ProcessRuleGrpcAdapter;
import iochti.processRule.grpc.ProcessRuleServiceGrpc;
import iochti.processRule.grpc.ProcessRuleServiceGrpc.ProcessRuleService;
import iochti.processRule.service.ProcessRuleManager;

import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.google.protobuf.Empty;

@Service
public class ProcessRuleServer {

	/**
	 * Process rule manager
	 */
	@Autowired
	private ProcessRuleManager processRuleManager;
	
	@Autowired
	private ProcessRuleGrpcAdapter grpcAdapter;

	private static final Logger logger = Logger
			.getLogger(ProcessRuleServer.class.getName());

	/* The port on which the server should run */
	private int port = 50052;
	private Server server;

	@PostConstruct
	private void PostConstruct() throws Exception {
		start();
	}

	private void start() throws Exception {
		server = ServerBuilder
				.forPort(port)
				.addService(
						ProcessRuleServiceGrpc
								.bindService(new ProcessRuleServiceImpl()))
				.build().start();
		logger.info("Server started, listening on " + port);
		Runtime.getRuntime().addShutdownHook(new Thread() {
			@Override
			public void run() {
				// Use stderr here since the logger may have been reset by its
				// JVM shutdown hook.
				System.err
						.println("*** shutting down gRPC server since JVM is shutting down");
				ProcessRuleServer.this.stop();
				System.err.println("*** server shut down");
			}
		});

	}

	private void stop() {
		if (server != null) {
			server.shutdown();
		}
	}

	private class ProcessRuleServiceImpl implements ProcessRuleService {

		@Override
		public void getProcessRule(IdRequest request,
				StreamObserver<ProcessRule> responseObserver) {

			String processRuleId = request.getId();
			ProcessRuleDTO processRules = processRuleManager.findById(processRuleId);
		}

		@Override
		public void findByThingGroupId(IdRequest request,
				StreamObserver<ProcessRule> responseObserver) {
			
			String thingGroupId = request.getId();
			List<ProcessRuleDTO> processRules = processRuleManager
					.findProcessRulesByThingGroupId(thingGroupId);
			
			processRules.forEach(rule -> {
				try {
					ProcessRule grpcObject = grpcAdapter.buildGrpc(rule);
					responseObserver.onNext(grpcObject);
				} catch (Exception e) {
					responseObserver.onError(e);
				}
				
				responseObserver.onCompleted();
			});

			responseObserver.onCompleted();
		}

		@Override
		public void createProcessRule(ProcessRule request,
				StreamObserver<ProcessRule> responseObserver) {
			
			try {
				ProcessRuleDTO dto = grpcAdapter.buildDto(request);
				ProcessRuleDTO savedDTO = processRuleManager.saveProcessRule(dto);
				ProcessRule grpcObject = grpcAdapter.buildGrpc(savedDTO);
				responseObserver.onNext(grpcObject);
			} catch (JsonParseException e) {
				responseObserver.onError(e);
			} catch (JsonMappingException e) {
				responseObserver.onError(e);
			} catch (IOException e) {
				responseObserver.onError(e);
			}
			
			responseObserver.onCompleted();
		}

		@Override
		public void updateProcessRule(ProcessRule request,
				StreamObserver<ProcessRule> responseObserver) {
			
			try {
				ProcessRuleDTO dto = grpcAdapter.buildDto(request);
				processRuleManager.saveProcessRule(dto);
			} catch (JsonParseException e) {
				responseObserver.onError(e);
			} catch (JsonMappingException e) {
				responseObserver.onError(e);
			} catch (IOException e) {
				responseObserver.onError(e);
			}
			
			responseObserver.onCompleted();
		}

		@Override
		public void deleteProcessRule(IdRequest request,
				StreamObserver<Empty> responseObserver) {
			
			processRuleManager.deleteProcessRule(request.getId());
		}
	}
}