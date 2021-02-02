package com.learn.darija.infrastructure.configuration;

import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackages = "com.learn.darija.infrastructure.repository.mongo")
public class MongoDBConfiguration {
}
