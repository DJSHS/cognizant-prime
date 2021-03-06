package com.example.models;

import javax.persistence.Embeddable;

@Embeddable
public enum DistanceUnit {
	 Millimeters("millimeters"),
	 Centimeters("centimeters"),
	 Meters("meters"),
	 Kilometers("kilometers"),
	 Inches("inches"),
	 Feet("feet"),
	 Yards("yards"),
	 Miles("miles");
	
	String value;

	DistanceUnit(String value) {
        this.value = value;
    }
}
