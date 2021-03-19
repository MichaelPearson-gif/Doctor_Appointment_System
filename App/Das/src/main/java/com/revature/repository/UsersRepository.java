package com.revature.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.revature.model.Users;

public interface UsersRepository extends JpaRepository<Users, Integer> {

	// Adding a new patient or doctor
	// Updating existing patient or doctor
	<S extends Users> S save(Users user);
	
	// Grab the user
	 Users findByUserId(int userId);
	 
	 // Get all doctors
	 @Query(value = "SELECT u FROM Users u WHERE u.roles.role = 'doctor'")
	 List<Users> findAllByRoles();
	
}
