package com.lls.springboot.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lls.springboot.email.MySimpleMailMessage;

@RestController
@RequestMapping("/email")
public class EmailController {

	@Autowired
	private MySimpleMailMessage simpleMessage;

	@RequestMapping(value = "/simple", method = RequestMethod.GET)
	public String sendSimpleEmail() {
		try {
			simpleMessage.send("1942625600@qq.com", "363422073@qq.com",
					"SpringBoot—Email Test", "ku cha jin yan ni le ");
			return Constant.SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Constant.FAILE;
	}

}
