package com.dcl.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

import lombok.SneakyThrows;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

	@Bean
	@SneakyThrows
	SecurityFilterChain filterChain(HttpSecurity httpSecurity) {
		
		httpSecurity.authorizeHttpRequests(req->req.requestMatchers("/dhee")  
				                                   .permitAll()
				                                   .anyRequest()
				                                   .authenticated())
					.httpBasic(Customizer.withDefaults())
					.formLogin(Customizer.withDefaults());
		
		return httpSecurity.build();
	}
			/**
			 * httpSecurity.authorizeHttpRequests() used to specify the authorization access as public or private.
			 * httpSecurity.httpBasic() is used to specify the basic auth
			 * httpSecurity.formLogin() is used to specify the login page
			 * 
			 * Customizer.withDefaults() is used to enable default logics available.
			 * */

}
