package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.employee.entity.Employee;
import com.employee.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	

	@GetMapping("/home")
	public String employees(Model model) {
		List<Employee> employees = employeeService.findAllEmployee();
		model.addAttribute("employees", employees);
		return "home";
		
	}
	
	
	@GetMapping("/showReg")
	public String showRegistration(Model model) {
		Employee employee=new Employee();
		model.addAttribute("employee",employee);
		return "create_registration";
	}
	
	@PostMapping("/home")
	public String createRegistration(@ModelAttribute("employee") Employee employee, Model model) {
		employeeService.createRegistration(employee);
		return "redirect:/home";
	}
	
	@RequestMapping("/search")
	public String searchEmployee(@RequestParam(value="query") String query, Model model) {
		List<Employee> employees=employeeService.searchEmployee(query);
		model.addAttribute("employees", employees);
		return "home";
	}

}
