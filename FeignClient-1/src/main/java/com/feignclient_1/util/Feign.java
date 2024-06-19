package com.feignclient_1.util;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "feign", url="http://localhost:8080/user")
public interface Feign {
	
	@GetMapping("suban")
	String name();
	
	@GetMapping("rythan")
	String namee();
	
	@GetMapping("kamban")
	String nameee();

}