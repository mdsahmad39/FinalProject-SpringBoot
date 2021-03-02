package com.finalproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dao.CustomerDao;
import com.dto.Address;
import com.dto.Customer;

@RestController
public class CustomerController {

	@Autowired
	CustomerDao customerDao;
	
	@PostMapping("/register_customer")
	public void register(@RequestBody Customer customer) {
		customerDao.register(customer);
	}
//	
//	private String houseNo;
//	private String street;
//	private String city;
//	private long pincode;
//	private String state;
//	private String country;
	
	@GetMapping("/register")
	public void register() {
		Address address = new Address("3-38", "Gachibowli", "HYD", 342423, "TG", "India");
		System.out.println(address.toString());
		String myaddress = address.toString();
		Customer customer = new Customer("ahmad", "ali", "male", myaddress, "hello@gmail.com", 8989898989l, "ahmad12", "password");
		customerDao.register(customer);
	}
	
	@RequestMapping("/login_customer/{loginId}/{password}")
	public Customer loginUser(@PathVariable("loginId") String loginId, @PathVariable("password") String password) {
		return customerDao.verifyCustomerInfo(loginId, password);
	}
}
