package com.revature.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.model.Address;
import com.revature.service.AddressService;

@RestController(value = "addressController")
@RequestMapping(path = "/address")
public class AddressController {

	// Autowiring the service layer
	@Autowired
	private AddressService addressService;
	
	// Creating a new address
	@PostMapping(path = "new-address", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void newAddress(@RequestBody Address address) {
		this.addressService.newAddress(address);
	}
	
	// Updating the address
	@PostMapping(path = "/update-address", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void updateAddress(@RequestBody Address address) {
		this.addressService.updateAddress(address);
	}
	
}
