package com.example.springbootcrudemployee.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.example.springbootcrudemployee.EmployeeDao;
import com.example.springbootcrudemployee.dto.Employee;
import com.example.springbootcrudemployee.dto.EmployeeResponse;
import com.example.springbootcrudemployee.exception.EmployeeException;

@Service
public class EmployeeService {
	@Autowired
EmployeeDao dao ;
	public EmployeeResponse<Employee> saveEmployee(Employee emp) throws EmployeeException {
		EmployeeResponse<Employee> es = new EmployeeResponse<Employee>();
		Employee emp2 = dao.saveEmployee(emp);
		if(emp2.getName() != null) {
			es.setStatusCode(HttpStatus.CREATED.value());
			es.setMsg("Data inserted succesfully");
			es.setData(emp2);
			return es;
		}
		else {
			 throw new EmployeeException("Please provide data");
		}
		
		
	}
	public Employee getById(int id) {
		
		return dao.getById(id);
	}
	public Employee updateEmployee( int id,Employee emp) {
		return dao.updateEmployee(id,emp);
	}
	public List<Employee> getAllData() {
		return dao.getAllData();
	}
	public Employee deleteEmployee(int id) {
		return dao.deleteEmployee(id);
		
	}
	
}
