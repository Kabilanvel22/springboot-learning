package com.example.demo.migration.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.example.demo.Model.Employee;
import com.example.demo.Repository.EmployeeRepository;
import com.example.demo.migration.Migration;

@Component
@Migration(context = "document", id = "generate-email_id", sequence = 1, author = "VISHAL KUMAR")

public class AddorUpdateEmail implements Serializable {

	
	private static final long serialVersionUID = 1L;
	private static final Logger LOGGER = LoggerFactory.getLogger(AddorUpdateEmail.class);
	
	@Autowired
	private transient EmployeeRepository employeeRepository;
	
	public void execute() {
		LOGGER.info(" generate-email_id :: =>  :: START");
		
		// fetch all Employees data from database
		List<Employee> allEmployees = this.employeeRepository.findAll();
		
		List<Employee> updatedList = new ArrayList<>();
		
		for( Employee emp : allEmployees) {
			
			if(StringUtils.isEmpty(emp.getEmailId())) {
				String email = emp.getFirstName() + emp.getId() + "@emp-mail.in";
				emp.setEmailId(email.toLowerCase());
				updatedList.add(emp);
				System.out.println(emp.getEmailId());
			}
		}
		
		this.employeeRepository.saveAll(updatedList);
		LOGGER.info(" generate-email_id :: =>  :: END");
	}
	
	
	
}
