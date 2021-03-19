package com.revature.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.model.Roles;

@Repository(value = "rolesRepository")
public interface RolesRepository extends JpaRepository<Roles, Integer> {

	// Get a role by id
	Roles findByRoleId(int roleId);
	
}
