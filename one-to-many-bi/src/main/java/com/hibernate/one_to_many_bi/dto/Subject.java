package com.hibernate.one_to_many_bi.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Subject {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String subName;
private String author;
@ManyToOne
@JoinColumn()
Teacher teacher;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getSubName() {
	return subName;
}
public void setSubName(String subName) {
	this.subName = subName;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public Teacher getTeacher() {
	return teacher;
}
public void setTeacher(Teacher teacher) {
	this.teacher = teacher;
}

}
