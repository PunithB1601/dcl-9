package com.dcl.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Component;

import com.dcl.entity.Student;
import com.dcl.repo.StudentRepo;

@Component
public class Test implements CommandLineRunner{

	@Autowired
	private StudentRepo srepo;
	
	@Override
	public void run(String... args) throws Exception {
		/*
		 * Student s1=new Student(1,"Ramu","ECE"); Student s2=new
		 * Student(2,"Raju","CSE"); Student s3=new Student(3,"Siddu","CIV"); Student
		 * s4=new Student(4,"Yeshwanth","ECE"); Student s5=new Student(5,"Siddu","ECE");
		 * Student s6=new Student(6,"Akash","ECE"); Student s7=new
		 * Student(7,"Amar","CIV"); Student s8=new Student(8,"Akash","CSE"); Student
		 * s9=new Student(9,"Keshav","CSE"); Student s10=new Student(10,"Ravi","CSE");
		 * 
		 * srepo.saveAll(Arrays.asList(s1,s2,s3,s4,s5,s6,s7,s8,s9,s10));
		 */
		
		/*
		 * Sort s=Sort.by("name","branch").ascending();
		 * srepo.findAll(s).forEach(System.out::println);
		 */
		
		/*
		 * PageRequest p=PageRequest.of(5-1,3); 
		 * Page<Student> page=srepo.findAll(p);
		 * page.forEach(System.out::println);
		 */
		
		Student s=new Student(); //for adding condition
		s.setName("Akash");
		s.setBranch("CSE");
		Example<Student> ex=Example.of(s);
		srepo.findAll(ex).forEach(System.out::println);
		
	}

	
}
