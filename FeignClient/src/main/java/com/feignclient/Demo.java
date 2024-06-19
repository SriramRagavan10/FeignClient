package com.feignclient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class Demo {

	@GetMapping(value = "/suban")
	public String love() {
		return "Suban Loves Maghizhaal";
	}

	@GetMapping(value = "/rythan")
	public String dream() {
		return "A World Without Music its A Beautiful Dream Without Eyes";
	}

	@GetMapping(value = "/kamban")
	public String world() {
		return "Journey for Love";
	}

}
