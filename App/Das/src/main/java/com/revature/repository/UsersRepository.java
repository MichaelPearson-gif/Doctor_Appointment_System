package com.revature.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.model.Users;

public interface UsersRepository extends JpaRepository<Users, Integer> {

	// Adding a new patient or doctor
	<S extends Users> S save(Users user);
	
}
