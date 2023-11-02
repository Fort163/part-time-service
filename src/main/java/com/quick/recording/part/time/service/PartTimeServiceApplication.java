package com.quick.recording.part.time.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(scanBasePackages = {"com.quick.recording"})
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.quick.recording.gateway.service")
public class PartTimeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PartTimeServiceApplication.class, args);
	}

}
