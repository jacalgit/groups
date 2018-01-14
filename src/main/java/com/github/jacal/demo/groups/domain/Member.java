package com.github.jacal.demo.groups.domain;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

@RelationshipEntity(type = "MEMBER_OF")
@NoArgsConstructor
@Getter @Setter
public class Member {

    @GraphId
    private Long id;

    @StartNode
    private Person member;

    @EndNode
    private Group group;


}
