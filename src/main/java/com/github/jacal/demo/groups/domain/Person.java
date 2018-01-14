package com.github.jacal.demo.groups.domain;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;
import org.springframework.data.annotation.Id;

import javax.annotation.Generated;
import java.util.LinkedHashSet;
import java.util.Set;

@NodeEntity
@NoArgsConstructor
@Getter @Setter
public class Person {

    @GraphId
    private Long id;

    private String lastName;
    private String firstName;

    @Relationship(type = "MEMBER_OF")
    private Set<Group> subscribedGroups = new LinkedHashSet<>();

    @Relationship(type = "OWNS")
    private Set<Group> ownedGroups = new LinkedHashSet<>();

    public String getName() {
        return firstName + " " + lastName;
    }
}
