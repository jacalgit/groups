package com.github.jacal.demo.groups.domain;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.*;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;
import org.springframework.data.annotation.Id;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

@NodeEntity
@NoArgsConstructor
@Getter @Setter
public class Group {

    @GraphId
    private Long id;

    private String name;
    private String description;

    @Relationship(type="MEMBERS_OF", direction=Relationship.INCOMING)
    private Set<Member> members = new LinkedHashSet<>();

    @Relationship(type="OWNS", direction=Relationship.INCOMING)
    private Set<Owner> owners = new LinkedHashSet<>();

}
