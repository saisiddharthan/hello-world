package com.application.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class DisplayController {
	
	@GetMapping("/details/{id}")
	public ResponseEntity<User> getDetails(@PathVariable Integer id) {
		User sample = new User();
		if(id==1) {
			sample.setId(id);
			sample.setName("Sid");
			sample.setDept("ECE");
			sample.setLocation("MDU");
			return new ResponseEntity<>(sample,HttpStatus.OK);
		} else {
			sample.setId(id);
			sample.setName("NA");
			return new ResponseEntity<>(sample,HttpStatus.BAD_REQUEST);
		}
	}

}
