package com.revature.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.model.Address;
import com.revature.repository.AddressRepository;

@Service(value = "addressService")
public class AddressService {

	// Autowiring the Repository bean
	@Autowired
	private AddressRepository addressRepository;
	
	// Creating a new address
	public void newAddress(Address address) {
		this.addressRepository.save(address);
	}
	
	// Updating the address
	public void updateAddress(Address address) {
		this.addressRepository.save(address);
	}
	
}
