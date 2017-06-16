package iochti.processRule.service;

import iochti.processRule.document.ProcessRuleDocument;
import iochti.processRule.document.ProcessRuleDocumentAdapter;
import iochti.processRule.dto.ProcessRuleDTO;
import iochti.processRule.repository.ProcessRuleRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProcessRuleManager {

	/**
	 * Mongodb process rule repository
	 */
	@Autowired
	private ProcessRuleRepository repository;

	/**
	 * Adapter for mongodb documents
	 */
	@Autowired
	private ProcessRuleDocumentAdapter documentAdapter;

	/**
	 * Find a process rule by its id
	 * 
	 * @param processRuleId
	 * @return The process rule
	 */
	public ProcessRuleDTO findById(String processRuleId) {
		ProcessRuleDocument document = repository.findOne(processRuleId);
		ProcessRuleDTO dto = documentAdapter.buildDTO(document);

		return dto;
	}

	/**
	 * Find a process rule by its thing group id
	 * 
	 * @param thingGroupId
	 * @return
	 */
	public List<ProcessRuleDTO> findProcessRulesByThingGroupId(
			String thingGroupId) {
		List<ProcessRuleDocument> processRulesDocuments = repository
				.findByThingGroupId(thingGroupId);
		List<ProcessRuleDTO> processRulesResult = new ArrayList<ProcessRuleDTO>();
		processRulesDocuments.forEach(x -> {
			processRulesResult.add(documentAdapter.buildDTO(x));
		});

		return processRulesResult;
	}

	/**
	 * Save a process rule
	 * 
	 * @param processRuleDTO
	 * @return
	 */
	public ProcessRuleDTO saveProcessRule(ProcessRuleDTO processRuleDTO) {
		ProcessRuleDocument document = documentAdapter
				.buildDocument(processRuleDTO);
		ProcessRuleDocument savedDocument = repository.save(document);
		ProcessRuleDTO savedDTO = documentAdapter.buildDTO(savedDocument);

		return savedDTO;
	}

	/**
	 * Delete a process rule
	 * 
	 * @param processRuleId
	 */
	public void deleteProcessRule(String processRuleId) {
		repository.delete(processRuleId);
	}
}
