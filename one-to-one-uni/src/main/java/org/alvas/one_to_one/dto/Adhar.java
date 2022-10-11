package org.alvas.one_to_one.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Adhar {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private long aadharNo;
private String address;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public long getAadharNo() {
	return aadharNo;
}
public void setAadharno(long aadharNo) {
	this.aadharNo = aadharNo;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}

}
