package com.finalproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dao.CustomerDao;
import com.dto.Customer;

@RestController
public class CustomerController {

	@Autowired
	CustomerDao customerDao;
	
	@PostMapping("/register_customer")
	public void register(@RequestBody Customer customer) {
		customerDao.register(customer);
	}
	
	@GetMapping("/register")
	public void register() {
		Customer customer = new Customer("Ali", "Ahmad", "male", "India", "AP", "HYD", "5-34-23, Bantumilli", 321123, "hello@gmail.com", 9848012345l, "aliali12", "password");
		customerDao.register(customer);
	}
	
	@RequestMapping("/login_customer/{loginId}/{password}")
	public Customer loginUser(@PathVariable("loginId") String loginId, @PathVariable("password") String password) {
		return customerDao.verifyCustomerInfo(loginId, password);
	}
}
