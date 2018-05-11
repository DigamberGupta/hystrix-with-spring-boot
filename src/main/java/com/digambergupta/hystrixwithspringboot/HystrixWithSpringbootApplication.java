package com.digambergupta.hystrixwithspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import liquibase.integration.spring.SpringLiquibase;

/**
 * @author Digamber Gupta
 */
@SpringBootApplication
@EnableJpaRepositories
@EnableHystrixDashboard
@EnableCircuitBreaker
public class HystrixWithSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(HystrixWithSpringbootApplication.class, args);
	}

}
