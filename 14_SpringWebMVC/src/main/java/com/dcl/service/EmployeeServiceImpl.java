package com.dcl.service;

import java.time.LocalDate;
import java.util.List;

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

	@Override
	public List<Employee> getAllEmployees() {
		return erepo.findAll();
	}

	@Override
	public Employee getById(Integer eid) {
		return erepo.findById(eid).orElse(null);
	}

	@Override
	public void updateEmployee(Employee e) {
		erepo.save(e);
	}

	@Override
	public void deleteEmployee(Integer eid) {
		erepo.deleteById(eid);
	}

	
}
