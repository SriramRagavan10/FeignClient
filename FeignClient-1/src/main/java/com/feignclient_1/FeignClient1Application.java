package com.feignclient_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FeignClient1Application {

	public static void main(String[] args) {
		SpringApplication.run(FeignClient1Application.class, args);
	}

}
