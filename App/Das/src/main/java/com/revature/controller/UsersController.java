package com.revature.controller;

import org.springframework.http.MediaType;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.model.Users;
import com.revature.service.UsersService;

@RestController(value = "usersController")
@RequestMapping(path = "/users")
public class UsersController {

	private UsersService usersService;
	
	@Autowired
	public void setUsersService(UsersService usersService) {
		this.usersService = usersService;
	}
	
//	@GetMapping(path = "/all")
//	public List<Users> getAllDoctors(){
//		return this.usersService.findAllDoctors();
//	}
	
	@PostMapping(path = "/new", consumes = {MediaType.APPLICATION_JSON_VALUE})
	public void registerNewPatient(@RequestBody Users user) {
		this.usersService.registerNewPatient(user);
	}
	
}
