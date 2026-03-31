package com.dcl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.dcl.service.EmailService;

@Component
public class TestRunner implements CommandLineRunner {

    private final Application application;

	@Autowired
	private EmailService eservice;

    TestRunner(Application application) {
        this.application = application;
    }
	
	@Override
	public void run(String... args) throws Exception {
		//eservice.sendMail("shreyas.1si21ec088@gmail.com");
		eservice.sendHtmlMail("siddupujeri56@gmail.com");
		System.out.println("Mails sent, kindly check your phones");
	}

}
