package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
