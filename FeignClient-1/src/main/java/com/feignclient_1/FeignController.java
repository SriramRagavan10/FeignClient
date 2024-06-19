package com.feignclient_1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.feignclient_1.util.Feign;

@RestController
@RequestMapping("/feign")
public class FeignController {

	@Autowired
	Feign feign;

	@GetMapping(value = "/userr")
	public String love() {
		return feign.name();
	}

	@GetMapping(value = "/userrs")
	public String journey() {
		return feign.namee();
	}

	@GetMapping(value = "/userrss")
	public String nanban() {
		return feign.nameee();
	}
}
