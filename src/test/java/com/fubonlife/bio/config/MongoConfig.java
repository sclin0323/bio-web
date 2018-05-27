package com.fubonlife.bio.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.MongoClient;

@Configuration
@EnableMongoRepositories("com.fubonlife.bio.repository.mongo")
public class MongoConfig extends AbstractMongoConfiguration{

	@Override
	public MongoClient mongoClient() {
		return new MongoClient("192.168.191.150", 27017);
	}

	@Override
	protected String getDatabaseName() {
		return "testdb";
	}

}
