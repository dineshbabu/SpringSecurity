package com.packtpub.restspring.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorldResource {

	@RequestMapping(value = "/again", method = RequestMethod.GET, produces=MediaType.TEXT_PLAIN_VALUE)
	public String helloWorld() {
		return "Hello World";
	}
}
