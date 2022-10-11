package com.example.springbootcrudemployee;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.springbootcrudemployee.dto.Employee;
import com.example.springbootcrudemployee.repository.EmployeeRepository;

@Repository
public class EmployeeDao {
	@Autowired
	EmployeeRepository empRepo;
	public Employee saveEmployee(Employee emp) {
		return empRepo.save(emp);
	}
	
	public Employee updateEmployee(int id, Employee emp) {
		Optional<Employee> optional =  empRepo.findById(id);
		if(optional!=null) {
			empRepo.save(emp);
			return emp;
		}
		else {
			return null;
		}
	}
	public Employee getById(int id) {
		Optional<Employee> optional = empRepo.findById(id);
		if(optional.isPresent()) {
		return optional.get();
		}
		else {
			return null;
		}
	}
	public List<Employee> getAllData() {
		return empRepo.findAll();
	}
	public Employee deleteEmployee(int id) {
		Optional<Employee> optional =  empRepo.findById(id);
		if(optional.isPresent()) {
			empRepo.delete(optional.get());
			return optional.get();
			}
			else {
				return null;
			}
	}
}
