package com.example.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.models.SpeedResult;

@RestController
@RequestMapping("/api/experiment")
public class SpeedResultController {

	@GetMapping("/{subjectName}/{convertTo}")
	public List<SpeedResult> getSpeedResult(@RequestParam String subjectName, @RequestParam String convertTo) {
		return new ArrayList<SpeedResult>();
	}
	
	@PostMapping("/")
	public SpeedResult createSpeedResult(@RequestBody SpeedResult s) {
		return s;
	}
}
