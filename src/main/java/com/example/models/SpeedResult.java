package com.example.models;

import javax.persistence.Entity;

@Entity
public class SpeedResult {
	
	 private Long id;
	 private String subjectName;
	 private Speed speed;
	 private Timestamp experimentTime;
	 
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public Speed getSpeed() {
		return speed;
	}
	public void setSpeed(Speed speed) {
		this.speed = speed;
	}
	public Timestamp getExperimentTime() {
		return experimentTime;
	}
	public void setExperimentTime(Timestamp experimentTime) {
		this.experimentTime = experimentTime;
	}
	 
	 
}
