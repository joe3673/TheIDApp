package com.Techmotion.appserver.repositiories;

import com.Techmotion.appserver.repositiories.model.OrganizationRecord;
import org.springframework.data.repository.CrudRepository;

public interface OrganizationRepository extends CrudRepository<OrganizationRecord, Long> {
}
