package com.dcl.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dcl.entity.Customer;
import java.util.List;


@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer>{

	public Customer findByMailId(String mailId); 
}
