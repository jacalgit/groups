package com.github.jacal.demo.groups.repositories;

import com.github.jacal.demo.groups.domain.Group;
import com.github.jacal.demo.groups.domain.Person;
import org.springframework.data.neo4j.repository.GraphRepository;

public interface PersonRepository extends GraphRepository<Person> {
    Person findByName(String name);
}
