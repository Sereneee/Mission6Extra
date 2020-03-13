package com.example.M6XClient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class M6XClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(M6XClientApplication.class, args);
	}

}

@RefreshScope
@RestController
class MsgRestCtrler{
	@Value("${message:default}")
	private String msg;

	@RequestMapping("/message")
	String getMsg(){
		return this.msg;
	}
}