package com.dcl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
@Service
public class EmailService {

	@Autowired
	private JavaMailSender jms;
	
	 public void sendMail(String toEmail) throws MessagingException {
	    /*  SimpleMailMessage message = new SimpleMailMessage();
	        message.setTo(toEmail);
	        message.setSubject("Greet Message");
	        message.setText("Hello, this message is sent from spring mail starter"); 
		*/
		 
		 MimeMessage message=jms.createMimeMessage();
		 MimeMessageHelper helper=new MimeMessageHelper(message, true);
		 helper.setTo("kirankumar@dheecodinglab.com");
		 helper.setSubject("Demo Html");
		 helper.setText("<h1>Welcome to springBoot</h1><p>Hello everyone</p>", true);
		 
		 	

	        jms.send(message);
	    }

}
