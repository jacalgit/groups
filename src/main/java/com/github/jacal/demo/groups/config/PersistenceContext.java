package com.github.jacal.demo.groups.config;

import org.neo4j.ogm.session.SessionFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableNeo4jRepositories("com.github.jacal.demo.groups.repositories")
@EnableTransactionManagement
@ComponentScan("com.github.jacal.demo.groups")
public class PersistenceContext {

    public SessionFactory getSessionFactory() {
        return new SessionFactory("com.github.jacal.demo.groups.domain");
    }
}