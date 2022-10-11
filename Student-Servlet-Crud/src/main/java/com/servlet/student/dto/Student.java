package com.servlet.student.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity

public class Student {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

private int studId;
private String studName;
private String studEmail;

public int getStudId() {
	return studId;
}
public void setStudId(int studId) {
	this.studId = studId;
}
public String getStudName() {
	return studName;
}
public void setStudName(String studName) {
	this.studName = studName;
}
public String getStudEmail() {
	return studEmail;
}
public void setStudEmail(String studEmail) {
	this.studEmail = studEmail;
}

}
