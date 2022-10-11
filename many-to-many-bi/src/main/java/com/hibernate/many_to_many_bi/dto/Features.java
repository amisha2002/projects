package com.hibernate.many_to_many_bi.dto;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.CreationTimestamp;

@Entity
public class Features {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int featureId;
	@CreationTimestamp
	private LocalDateTime dateTime;
	private String featureName;
	@ManyToMany

	@JoinTable(name = "my_car_id",
	joinColumns = @JoinColumn(name = "car_features_id"),
	inverseJoinColumns = @JoinColumn(name = "cars_id"))
	List<Car> cars;
	public int getFeatureId() {
		return featureId;
	}
	public void setFeatureId(int featureId) {
		this.featureId = featureId;
	}
	public LocalDateTime getDateTime() {
		return dateTime;
	}
	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}
	public String getFeatureName() {
		return featureName;
	}
	public void setFeatureName(String featureName) {
		this.featureName = featureName;
	}
	public List<Car> getCars() {
		return cars;
	}
	public void setCars(List<Car> cars) {
		this.cars = cars;
	}
	
	
	
}
