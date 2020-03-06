package com.example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.models.SpeedResult;
import com.example.repositories.SpeedRepository;
import com.example.services.ConvertFeignClient;

@RestController
@RequestMapping("/api/experiment")
public class SpeedResultController {
	
	@Autowired
	private SpeedRepository speedRepository;
	
	@Autowired
	private ConvertFeignClient convertFeignClient;
	
	@GetMapping
	public List<SpeedResult> getSpeedResult(@RequestParam String subjectName, @RequestParam String convertTo) {
		List<SpeedResult> speedResults = speedRepository.findBySubjectName(subjectName);
		
		for (SpeedResult sr: speedResults) {
			double newUnit = convertFeignClient.convertResult(sr.getSpeed().getDistance().getUnit(), sr.getSpeed().getDistance().getDistanceUnit().toString(), convertTo);
			sr.getSpeed().getDistance().setUnit(newUnit);
		}
		return speedResults;
	}
	
	@PostMapping
	public SpeedResult createSpeedResult(@RequestBody SpeedResult s) {
		return speedRepository.save(s);
	}

}
