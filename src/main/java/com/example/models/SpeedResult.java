package com.example.models;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SpeedResult {
	
	@Id
	private Long id;
	
	@Column(name = "subject_name")
	private String subjectName;
	
	@Column
	@Embedded
	private Speed speed;
	
	@Column(name = "experiment_time")
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
