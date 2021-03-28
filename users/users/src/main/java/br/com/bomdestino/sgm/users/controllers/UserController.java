package br.com.bomdestino.sgm.users.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.bomdestino.sgm.users.models.User;
import br.com.bomdestino.sgm.users.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	private final UserService service;
	
	public UserController(UserService service) {
		this.service = service;
	}
	
	@GetMapping("/search")
	public ResponseEntity<User> getUserByEmail(@RequestParam String email){
		User user = this.service.findUserByEmail(email);
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}

}
