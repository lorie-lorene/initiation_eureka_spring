
package com.example.serviceregistrationanddiscoveryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

//http://localhost:8080/service-instances/a-bootiful-client
@EnableEurekaServer
@SpringBootApplication
public class ServiceRegistrationAndDiscoveryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceRegistrationAndDiscoveryServiceApplication.class, args);
	}
}