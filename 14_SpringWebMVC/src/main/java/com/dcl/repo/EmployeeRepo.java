package com.dcl.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dcl.entity.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

}
