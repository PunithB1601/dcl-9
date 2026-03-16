package com.dcl.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dcl.entity.Employee;
import com.dcl.iservice.EmployeeService;
import com.dcl.repo.EmployeeRepo;


@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepo erepo;
	
	@Override
	public Employee register(Employee e) {
		e.setDate(LocalDate.now());
		return erepo.save(e);
	}

	
}
