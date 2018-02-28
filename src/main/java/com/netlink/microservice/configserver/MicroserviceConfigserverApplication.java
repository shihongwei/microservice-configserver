package com.netlink.microservice.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class MicroserviceConfigserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceConfigserverApplication.class, args);
	}
}
