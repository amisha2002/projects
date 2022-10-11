package com.hibernate.many_to_many.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Subjects {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int subjectId;
private String subjectName;
private String subjectAuthor;
public int getSubjectId() {
	return subjectId;
} 
public void setSubjectId(int subjectId) {
	this.subjectId = subjectId;
}
public String getSubjectName() {
	return subjectName;
}
public void setSubjectName(String subjectName) {
	this.subjectName = subjectName;
}
public String getSubjectAuthor() {
	return subjectAuthor;
}
public void setSubjectAuthor(String subjectAuthor) {
	this.subjectAuthor = subjectAuthor;
}

}
