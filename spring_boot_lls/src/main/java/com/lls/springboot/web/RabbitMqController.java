package com.lls.springboot.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lls.springboot.rabbitmq.Sender;

@RestController
public class RabbitMqController {

	@Autowired
	private Sender sender;

	@RequestMapping(value = "/rabbit", method = RequestMethod.GET)
	public String sendMessage() {
		this.sender.send();
		return "请看控制台的输出";
	}
}
