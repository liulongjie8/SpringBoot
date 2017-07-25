package com.lls.springboot.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Helle world
 * 
 * @author LLS
 * 
 */
@RestController
public class HelloWorldController {

	@RequestMapping("/hello")
	public String sayHello() {
		return "Hello,World!";
	}

}
