package com.dcl.service;

import java.util.Collection;
import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.dcl.entity.Customer;
import com.dcl.repo.CustomerRepo;

@Service
public class CustomerService implements UserDetailsService{
	
	@Autowired
	private BCryptPasswordEncoder passwordEncode;
	
	@Autowired
	private CustomerRepo crepo;

	public Customer saveCustomer(Customer c) {
		c.setPassword(passwordEncode.encode(c.getPassword()));  
		return crepo.save(c);
	}

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		Customer c=crepo.findByMailId(email);
		return new User(c.getMailId(),c.getPassword(),Collections.EMPTY_LIST);
	}

}
