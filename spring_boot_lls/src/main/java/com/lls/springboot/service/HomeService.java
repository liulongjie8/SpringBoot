package com.lls.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lls.springboot.bean.HomeProperties;

@Service
public class HomeService {

	@Autowired
	private HomeProperties home;

	public String getHomeDesc() {
		return home.getDesc();
	}

	public String getHome() {
		return home.toString();
	}
}
