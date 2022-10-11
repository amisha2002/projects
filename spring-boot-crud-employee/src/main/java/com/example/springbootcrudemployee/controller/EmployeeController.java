package com.example.springbootcrudemployee.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootcrudemployee.dto.Employee;
import com.example.springbootcrudemployee.dto.EmployeeResponse;
import com.example.springbootcrudemployee.exception.EmployeeException;
import com.example.springbootcrudemployee.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService es;
	@RequestMapping("/getData")
public String getData() {
	return "Today is last date";
}
	@PostMapping("/saveEmployee")
	public EmployeeResponse<Employee>  saveEmployee(@RequestBody Employee emp ) throws EmployeeException {
		return es.saveEmployee(emp);
	}
	@PutMapping("/updateEmployee/{id}")
	public Employee updateEmployee(@PathVariable int id, @RequestBody Employee emp) {
		return es.updateEmployee(id, emp);
	}
	@GetMapping("/getEmpData/{id}")
	public Employee getById(@PathVariable int id) {
		return es.getById(id);
	}
	@GetMapping("/getAllData")
	public List<Employee> getAllData() {
		return es.getAllData();
	}
	@DeleteMapping("/deleteData/{id}")
	public Employee deleteEmployee(@PathVariable int id) {
		return es.deleteEmployee(id);
	}
}
