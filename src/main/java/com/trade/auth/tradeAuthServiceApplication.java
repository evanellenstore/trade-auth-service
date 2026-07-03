package com.trade.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class tradeAuthServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(tradeAuthServiceApplication.class, args);
	}

}
