package com.mindbowser.spring.mail;

public interface MailSender {
	public void send(String to, String subject, String body);
}
