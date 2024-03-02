package com.example.demorepository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Employee;
@Repository
public interface Employeerepository extends PagingAndSortingRepository<Employee, Long> {

	List<Employee> findAllEmployeesByDept(String dept);

	List<Employee> findByNameStartingWith(String prefix);

	List<Employee> findByNameEndingWith(String suffix);

	int updateEmployeeSalary(double sal, long id);

	

	}
