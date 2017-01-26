package com.mindbowser.spring.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mindbowser.spring.mail.MailSender;

@RestController
public class MailController {

	@Resource
	MailSender mailSender;

	@RequestMapping("/mail")
	public String home() {
		mailSender.send("raju.nichit@mindbowser.com", "Spring Developer", "Test email body");
		return "Mail sent";
	}
}
