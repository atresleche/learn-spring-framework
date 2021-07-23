package com.in28minutes.learnspringframework.sample.enterprise.flow;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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

// Business layer
// Business logic
@Component
class BusinessService {
	@Autowired
	private DataService dataService;
	
	public long calculateSum() {
		List<Integer> data = dataService.retrieveData();
		return data.stream().reduce(Integer::sum).get();
	}
}

// Data layer
// Getting data
@Component
class DataService {
	public List<Integer> retrieveData(){
		return Arrays.asList(12, 34, 56, 28, 90);
	}
}
