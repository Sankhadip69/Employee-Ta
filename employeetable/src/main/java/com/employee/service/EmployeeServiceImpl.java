package com.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.entity.Employee;
import com.employee.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	


	@Override
	public List<Employee> findAllEmployee() {
		List<Employee> employees = employeeRepository.findAll();
		
		return employees;
	}



	@Override
	public void createRegistration(Employee employee) {
		employeeRepository.save(employee);

	}



	@Override
	public List<Employee> searchEmployee(String query) {
		List<Employee> employees = employeeRepository.searchEmployee(query);
		return employees;
	}

}
