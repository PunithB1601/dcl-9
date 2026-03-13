package com.dcl.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dcl.entity.Subscription;
@Repository
public interface SubscriptionRepo extends JpaRepository<Subscription, Integer>{
	
}
