package com.example.springbootcrudemployee.exception;

public class EmployeeException extends Exception {
private String msg;

public EmployeeException(String msg) {
	super();
	this.msg = msg;
}

public String getMsg() {
	return msg;
}

}
