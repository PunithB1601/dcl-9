package com.dcl.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import com.dcl.service.CustomerService;

import lombok.SneakyThrows;

@Configuration
@EnableWebSecurity
public class AppConfig {

	
	@Autowired
	private CustomerService cservice;
	
	@Bean
	public BCryptPasswordEncoder passwordEncode() {  //to encrypt customer password
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	public DaoAuthenticationProvider authProvider() {
		DaoAuthenticationProvider provider=new DaoAuthenticationProvider(cservice);
		provider.setPasswordEncoder(passwordEncode());
		return provider;
	}
	
	@Bean
	@SneakyThrows
	public AuthenticationManager authManager(AuthenticationConfiguration config) {
		return config.getAuthenticationManager();
	}
	
	
	@Bean
	@SneakyThrows
	public SecurityFilterChain filterChain(HttpSecurity httpSecurity) {
		
		httpSecurity.csrf().disable()
					.authorizeHttpRequests(req->req.requestMatchers("/save","/login")
												   .permitAll()
												   .anyRequest()
												   .authenticated());
		return httpSecurity.build();
	}

}
