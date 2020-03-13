package com.example.M6XServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class M6XServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(M6XServerApplication.class, args);
	}

}
