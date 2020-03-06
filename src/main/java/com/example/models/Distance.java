package com.example.models;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;

@Embeddable
public class Distance {
	
	@Embedded
	private DistanceUnit distanceUnit;
	private Double unit;
	
	public DistanceUnit getDistanceUnit() {
		return distanceUnit;
	}
	public void setDistanceUnit(DistanceUnit distanceUnit) {
		this.distanceUnit = distanceUnit;
	}
	public Double getUnit() {
		return unit;
	}
	public void setUnit(Double unit) {
		this.unit = unit;
	}
	
	
}
