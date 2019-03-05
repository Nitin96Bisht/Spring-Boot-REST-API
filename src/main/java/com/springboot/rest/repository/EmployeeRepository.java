package com.springboot.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.rest.model.Employee;

/**
 * Employee Repository Interface
 * 
 * @author Nitin Bisht
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	
}
