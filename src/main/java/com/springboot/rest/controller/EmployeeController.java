package com.springboot.rest.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.rest.model.Employee;
import com.springboot.rest.repository.EmployeeRepository;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {

	private EmployeeRepository employeeRepository;
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployee() {
		return employeeRepository.findAll();
	}
}
