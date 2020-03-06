package com.example.services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "distanceunit-repository")
public interface ConvertFeignClient {
	
	@RequestMapping(method = RequestMethod.GET, value = "/api/convert/{from}/to/{to}")
	Double convertResult(@RequestParam Double unit, @PathVariable String from, @PathVariable String to);
}
