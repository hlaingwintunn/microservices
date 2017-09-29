package com.hlaing.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.hlaing.microservices.dao.AccountRepository;
import com.hlaing.microservices.dao.RemoteAccountRepository;

@SpringBootApplication
@EnableDiscoveryClient
public class WebclientApplication {

	public static final String ACCOUNTS_SERVICE_URL = "http://ACCOUNTS-MICROSERVICE";

	public static void main(String[] args) {
		SpringApplication.run(WebclientApplication.class, args);
	}

	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

	@Bean
	public AccountRepository accountRepository() {
		return new RemoteAccountRepository(ACCOUNTS_SERVICE_URL);
	}
}
