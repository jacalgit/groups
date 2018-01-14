package com.github.jacal.demo.groups.repositories;

import com.github.jacal.demo.groups.domain.Group;
import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

public interface GroupRepository extends GraphRepository<Group> {
}
