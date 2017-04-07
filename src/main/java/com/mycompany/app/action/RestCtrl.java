package com.mycompany.app.action;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestCtrl {

	@RequestMapping("/")
	public String helloPage() {
		return "Hello! Spring Boot!";
	}

	@RequestMapping("/hello/{name}")
	public @ResponseBody String hello(@PathVariable("name") String name) {
		return "Hello " + name;
	}
}
