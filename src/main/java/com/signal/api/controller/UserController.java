package com.signal.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.signal.api.model.AuthenticationRequest;
import com.signal.api.model.User;
import com.signal.api.repositories.UserRepository;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class UserController {
	
	@Autowired
	UserRepository userRepository;
	
	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public ResponseEntity<String> hello() { 
		return ResponseEntity.ok("BOnjour");
	}
	
	@RequestMapping(value = "/user", method = RequestMethod.POST)
	public ResponseEntity<String> saveUser(@RequestBody AuthenticationRequest authenticationRequest){
		String username = authenticationRequest.getUsername();
		String password = authenticationRequest.getPassword();
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		try {
			userRepository.save(user);
		}catch(Exception e) {
			return ResponseEntity.ok("Return with error : " + e);
		}
		return ResponseEntity.ok("User Saved");
	}

}
