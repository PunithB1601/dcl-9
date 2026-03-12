package com.dcl.iservice;

import java.util.List;

import com.dcl.entity.Subscription;

public interface SubscriptionService {

	public Subscription addSubscription(Subscription s);
	
	public List<Subscription> getAllSubscription();
	
}
