package com.lls.springboot.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lls.springboot.service.HomeService;

@RestController
public class HomeController {

	@Autowired
	private HomeService service;

	@RequestMapping("/home")
	public String home() {
		return service.getHome();
	}
}
