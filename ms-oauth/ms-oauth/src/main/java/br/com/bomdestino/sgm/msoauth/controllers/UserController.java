package br.com.bomdestino.sgm.msoauth.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.bomdestino.sgm.msoauth.services.UserServiceImpl;

@RestController
@RequestMapping(value = "/users")
public class UserController {
	
	private final UserServiceImpl service;
	
	@Autowired
	public UserController(UserServiceImpl service) {
		this.service = service;
	}
	
	@GetMapping(value = "/search")
	public ResponseEntity<UserDetails> findUserByEmail(@RequestParam String email){
		try {
			UserDetails user = service.loadUserByUsername(email);
			return new ResponseEntity<UserDetails>(user, HttpStatus.OK);
		} catch (IllegalArgumentException e) {
			return new ResponseEntity<UserDetails>(HttpStatus.NOT_FOUND);
		}
		
	}

}
