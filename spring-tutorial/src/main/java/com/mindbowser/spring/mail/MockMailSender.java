package com.mindbowser.spring.mail;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class MockMailSender implements MailSender {

	private static Logger logger = LoggerFactory.getLogger(MockMailSender.class);

	@Override
	public void send(String to, String subject, String body) {
		logger.info("Sending mail to: " + to);
		logger.info("Subject: " + to);
		logger.info("Body: " + to);
	}

}
