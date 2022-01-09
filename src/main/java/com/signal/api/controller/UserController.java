package com.signal.api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public ResponseEntity<String> hello() { 
		return ResponseEntity.ok("BOnjour");
	}

}
