package com.dcl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;

@Service
public class EmailService {

	@Autowired
	private JavaMailSender jms;
	
	public void sendMail(String receiver) {
		SimpleMailMessage message=new SimpleMailMessage();
		message.setTo(receiver);
		message.setSubject("Regarding spring boot classs");
		message.setText("Please come at right time");
		jms.send(message);
	}
	
	public void sendHtmlMail(String receiver) throws MessagingException {
		MimeMessage message=jms.createMimeMessage();
		MimeMessageHelper helper=new MimeMessageHelper(message,true);
		String[] accounts={"yashvardhan6565@gmail.com","cyashwanth06@gmail.com"};
		
		helper.setTo(receiver);
		helper.setBcc("shreyas.1si21ec088@gmail.com");
		helper.setCc(accounts);
		helper.setSubject("Regarding Siddu's Girlfriend");
		helper.setText("<h1>Hey Siddu,</h1><p>Your GF was roaming with someone else. Throw me a party!</p>",true);
		
		jms.send(message);
	}
	
	

}
