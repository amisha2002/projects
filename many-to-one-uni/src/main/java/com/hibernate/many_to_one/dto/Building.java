package com.hibernate.many_to_one.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Building {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int buildingId;
	private String buildingName;
	private String buildingColor;
	@ManyToOne(cascade = CascadeType.PERSIST)
	private College college;
	public int getBuildingId() {
		return buildingId;
	}
	public void setBuildingId(int buildingId) {
		this.buildingId = buildingId;
	}
	public String getBuildingName() {
		return buildingName;
	}
	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}
	public String getBuildingColor() {
		return buildingColor;
	}
	public void setBuildingColor(String buildingColor) {
		this.buildingColor = buildingColor;
	}
	public College getCollege() {
		return college;
	}
	public void setCollege(College college) {
		this.college = college;
	}
	
}
