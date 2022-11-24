package com.employee.service;

import java.util.List;

import com.employee.entity.Employee;

public interface EmployeeService {
	
	List<Employee> findAllEmployee();
	
	void  createRegistration(Employee employee);
	
	List<Employee> searchEmployee(String query);
}
