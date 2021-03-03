package com.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dto.Address;

@Service
public class AddressDao {

	@Autowired
	AddressRepository addressRepository;
	
	public void register(Address address) {
		addressRepository.save(address);
	}
}
