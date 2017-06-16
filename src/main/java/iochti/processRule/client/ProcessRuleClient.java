package iochti.processRule.client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import iochti.processRule.dto.ProcessRuleDTO;
import iochti.processRule.grpc.ProcessRule;
import iochti.processRule.grpc.ProcessRule.Builder;
import iochti.processRule.grpc.ProcessRuleServiceGrpc;

import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ProcessRuleClient {
	private static final Logger logger = Logger
			.getLogger(ProcessRuleClient.class.getName());

	private final ManagedChannel channel;
	private final ProcessRuleServiceGrpc.ProcessRuleServiceBlockingStub blockingStub;

	/** Construct client connecting to HelloWorld server at {@code host:port}. */
	public ProcessRuleClient(String host, int port) {
		channel = ManagedChannelBuilder.forAddress(host, port)
				.usePlaintext(true).build();
		blockingStub = ProcessRuleServiceGrpc.newBlockingStub(channel);
	}

	public void shutdown() throws InterruptedException {
		channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
	}

	public void createProcessRule(ProcessRuleDTO dto) {
		try {
			logger.info("Will try to create a process rule "
					+ dto.getName() + " ...");
			Builder builder = ProcessRule.newBuilder();
			if (dto.getId() != null) {
				builder.setId(dto.getId());
			}
			builder.setName(dto.getName());
			builder.setRuleTypeId(dto.getRuleTypeId());
			builder.setThingGroupId(dto.getThingGroupId());
			ObjectMapper objectMapper = new ObjectMapper();
			builder.setParameters(objectMapper.writeValueAsString(dto
					.getParameters()));
			ProcessRule request = builder.build();
			blockingStub.createProcessRule(request);
			logger.info("Data sent");
		} catch (RuntimeException | JsonProcessingException e) {
			logger.log(Level.WARNING, "RPC failed", e);
			return;
		}
	}

	public static void main(String[] args) throws Exception {
		ProcessRuleClient client = new ProcessRuleClient("localhost",
				50052);
		try {
			ProcessRuleDTO dto = new ProcessRuleDTO();
			dto.setName("Temperature average");
			dto.setRuleTypeId("5942440764296f1656746a06");
			dto.setThingGroupId("thermometer");
			Properties parameters = new Properties();
			parameters.setProperty("field name", "temperature");
			dto.setParameters(parameters);
			client.createProcessRule(dto);
		} finally {
			client.shutdown();
		}
	}
}
