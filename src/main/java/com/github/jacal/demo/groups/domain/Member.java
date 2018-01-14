package com.github.jacal.demo.groups.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

@RelationshipEntity(type = "OWNS")
@NoArgsConstructor
@Getter
public class Owner {
    @GraphId
    private Long id;

    @StartNode
    private Person owner;

    @EndNode
    private Group group;
}
