package com.example.demo.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.demo.model.Employee;



public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Long> {

	List<Employee> findByNameStartingWith(String prefix);

	List<Employee> findAllEmployeesByDept(String dept);

	List<Employee> findByNameEndingWith(String suffix);

	int updateEmployeeSalary(double sal, long id);

	}
