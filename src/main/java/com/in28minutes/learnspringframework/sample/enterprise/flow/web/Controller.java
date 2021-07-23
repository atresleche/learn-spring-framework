package com.in28minutes.learnspringframework.sample.enterprise.flow.web;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.learnspringframework.sample.enterprise.flow.business.BusinessService;

// Web layer - for UI or API 
// Sending response in the right format - JSON, XML, history email format
@RestController
public class Controller {
	
	@Autowired
	private BusinessService businessService;
	// When user types in a URL "/sum" => 100
	// localhost:8080/sum on local browser
	@GetMapping("/sum")
	public long displaySum() {
		return businessService.calculateSum();
	}
}
