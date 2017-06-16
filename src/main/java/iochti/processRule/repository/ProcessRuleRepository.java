package iochti.processRule.repository;

import java.util.List;

import iochti.processRule.document.ProcessRuleDocument;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProcessRuleRepository extends MongoRepository<ProcessRuleDocument, String> {
	
	/**
	 * Find a process rule by its thing group id
	 * 
	 * @param thingGroupId
	 * @return
	 */
	List<ProcessRuleDocument> findByThingGroupId(String thingGroupId);
}
