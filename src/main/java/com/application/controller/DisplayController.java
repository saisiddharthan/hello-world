package com.application.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class DisplayController {
	
	@GetMapping("/details/{id}")
	public User getDetails(@PathVariable Integer id) {
		User sample = new User();
		if(id==1) {
			sample.setId(id);
			sample.setName("Sid");
			sample.setDept("ECE");
			sample.setLocation("MDU");
		} else {
			sample.setId(id);
			sample.setName("NA");
		}
		return sample;
	}

}
