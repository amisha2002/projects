package com.example.springbootcrudemployee.exception;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.springbootcrudemployee.dto.EmployeeResponse;
@ControllerAdvice
public class EmployeeExceptionHandler {
	@ExceptionHandler(value=EmployeeException.class)
public ResponseEntity<EmployeeResponse<String>> IdNotFoundException(EmployeeException emp) {
		EmployeeResponse<String> empResp = new  EmployeeResponse<String>();
		empResp.setMsg("Id not found");
		empResp.setStatusCode(HttpStatus.NOT_FOUND.value());
		empResp.setData(emp.getMessage());
		return new ResponseEntity<EmployeeResponse<String>>(empResp,HttpStatus.NOT_FOUND);
	}
}
