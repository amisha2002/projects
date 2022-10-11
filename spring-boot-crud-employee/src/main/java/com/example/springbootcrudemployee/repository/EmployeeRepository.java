package com.example.springbootcrudemployee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springbootcrudemployee.dto.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer>{

}
