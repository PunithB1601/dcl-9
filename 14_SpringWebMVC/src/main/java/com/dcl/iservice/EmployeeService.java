package com.dcl.iservice;

import java.util.List;

import com.dcl.entity.Employee;

public interface EmployeeService {

	Employee register(Employee e);
	
	List<Employee> getAllEmployees();
	
	Employee getById(Integer eid);
	
	void updateEmployee(Employee e);
	
	void deleteEmployee(Integer eid);
	
	
}
