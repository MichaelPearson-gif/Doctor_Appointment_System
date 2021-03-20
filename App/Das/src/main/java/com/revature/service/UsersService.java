package com.revature.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.model.Users;
import com.revature.repository.UsersRepository;

@Service(value = "usersService")
public class UsersService {

	private UsersRepository usersRepository;
	
	@Autowired
	public void setUsersRepository(UsersRepository usersRepository) {
		this.usersRepository = usersRepository;
	}
	
	// Creating a new patient
	public void registerNewPatient(Users user) {
		this.usersRepository.save(user);
	}
	
	// Updating patient or doctor info
	public void updateInfo(Users user) {
		this.usersRepository.save(user);
	}
	
	// Get all doctors
//	public List<Users> findAllDoctors(){
//		
//		return this.usersRepository.findAllByRoles(role.getUserRole());
//	}
	
	// Grab user info
	public Users viewUser(int userId) {
		return usersRepository.findByUserId(userId);
	}
	
}
