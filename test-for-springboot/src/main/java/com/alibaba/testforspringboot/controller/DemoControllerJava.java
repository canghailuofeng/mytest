package com.alibaba.testforspringboot.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@EnableAutoConfiguration
public class DemoControllerJava {
	@GetMapping("/hello")
	public String sayHello(String name) {
		return "hello ,"+name;
	}
}
