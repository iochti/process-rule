package iochti.processRule.document;

import org.springframework.stereotype.Service;

import iochti.processRule.dto.ProcessRuleDTO;

@Service
public class ProcessRuleDocumentAdapter {
	
	public ProcessRuleDTO buildDTO(ProcessRuleDocument document) {
		ProcessRuleDTO result = new ProcessRuleDTO();
		result.setId(document.getId());
		result.setRuleTypeId(document.getRuleTypeId());
		result.setThingGroupId(document.getThingGroupId());
		result.setName(document.getName());
		result.setParameters(document.getParameters());
		
		return result;
	}
	
	public ProcessRuleDocument buildDocument(ProcessRuleDTO dto) {
		ProcessRuleDocument result = new ProcessRuleDocument();
		result.setId(dto.getId());
		result.setRuleTypeId(dto.getRuleTypeId());
		result.setThingGroupId(dto.getThingGroupId());
		result.setName(dto.getName());
		result.setParameters(dto.getParameters());
		
		return result;
	}
}
