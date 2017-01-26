package com.mindbowser.spring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mindbowser.spring.mail.MailSender;
import com.mindbowser.spring.mail.MockMailSender;

@RestController
public class MailController {

	MailSender mockMailSender = new MockMailSender();

	@RequestMapping("/mail")
	public String home() {
		mockMailSender.send("raju.nichit@mindbowser.com", "Spring Developer", "Test email body");
		return "Mail sent";
	}
}
