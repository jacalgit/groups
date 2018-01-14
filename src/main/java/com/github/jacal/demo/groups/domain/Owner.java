package com.github.jacal.demo.groups.domain;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.*;
import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

@RelationshipEntity(type = "OWNS")
@NoArgsConstructor
@Getter @Setter
public class Owner {
    @GraphId
    private Long id;

    @StartNode
    private Person owner;

    @EndNode
    private Group group;
}
