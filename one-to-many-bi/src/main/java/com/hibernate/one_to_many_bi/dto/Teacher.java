package com.hibernate.one_to_many_bi.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Teacher {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int teacherId;
private String teacherName;
private String teacherEmail;
@OneToMany(mappedBy = "teacher")
List<Subject> subject;

public int getTeacherId() {
	return teacherId;
}

public void setTeacherId(int teacherId) {
	this.teacherId = teacherId;
}

public String getTeacherName() {
	return teacherName;
}

public void setTeacherName(String teacherName) {
	this.teacherName = teacherName;
}

public String getTeacherEmail() {
	return teacherEmail;
}

public void setTeacherEmail(String teacherEmail) {
	this.teacherEmail = teacherEmail;
}

public List<Subject> getSubject() {
	return subject;
}

public void setSubject(List<Subject> subject) {
	this.subject = subject;
} 

}
