package com.lls.springboot.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

/**
 * 简单的邮件发送
 * 
 * @author LLS
 * 
 */
@Service
public class MySimpleMailMessage {

	@Autowired
	private JavaMailSender sender;

	/**
	 * 
	 * @param from
	 *            来自哪里
	 * @param to
	 *            发往何处
	 * @param subject
	 *            主体
	 * @param text
	 *            内容
	 * @throws Exception
	 */
	public void send(String from, String to, String subject, String text)
			throws Exception {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom(from);
		message.setTo(to);
		message.setSubject(subject);
		message.setText(text);
		sender.send(message);
	}
}
