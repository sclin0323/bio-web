package com.fubonlife.bio.app;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.fubonlife.bio.config.HttpSessionConfig;





// Spring Data MongoDB
@EnableMongoRepositories("com.fubonlife.bio.repository.mongo")

// Spring Data JPA for MySQL
@EnableJpaRepositories(basePackages = "com.fubonlife.bio.repository.jpa")
@EntityScan("com.fubonlife.bio.entity.jpa") 

// Spring Session Mongo
@Import({ HttpSessionConfig.class})

@PropertySource("classpath:config-${spring.profiles.active:local}.properties")
@ComponentScan(basePackages = { "com.fubonlife.bio.controller", "com.fubonlife.bio.service" })
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Application.class, args);

		System.out.println("Let's inspect the beans provided by Spring Boot:");

		String[] beanNames = ctx.getBeanDefinitionNames();
		Arrays.sort(beanNames);
		for (String beanName : beanNames) {
			System.out.println(beanName);
		}

	}

}
