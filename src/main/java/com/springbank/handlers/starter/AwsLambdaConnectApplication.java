package com.springbank.handlers.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = { "com.springbank.repositories" })
@EntityScan(basePackages = { "com.springbank.domains" })
@SpringBootApplication(scanBasePackages = { "com.springbank" })
public class AwsLambdaConnectApplication {

	public static void main(String[] args) {
		SpringApplication.run(AwsLambdaConnectApplication.class, args);
	}

}
