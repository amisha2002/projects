package com.hibernate.many_to_many.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int studentId;
private String studentName;
private long studentPhone;
@ManyToMany
List<Subjects> subjects ;

public int getStudentId() {
	return studentId;
}
public void setStudentId(int studentId) {
	this.studentId = studentId;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public long getStudentPhone() {
	return studentPhone;
}
public void setStudentPhone(long studentPhone) {
	this.studentPhone = studentPhone;
}
public List<Subjects> getSubjects() {
	return subjects;
}
public void setSubjects(List<Subjects> subjects) {
	this.subjects = subjects;
}

}
