package com.dcl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dcl.entity.Subscription;
import com.dcl.iservice.SubscriptionService;
import com.dcl.repo.SubscriptionRepo;

@Service
public class SubscriptionServiceImpl implements SubscriptionService{

	@Autowired
	private SubscriptionRepo srepo;
	
	@Override
	public Subscription addSubscription(Subscription s) {
		// TODO Auto-generated method stub
		return srepo.save(s);
	}

	@Override
	public List<Subscription> getAllSubscription() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
