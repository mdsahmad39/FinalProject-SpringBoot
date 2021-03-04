package com.finalproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dao.AddressDao;
import com.dao.CustomerDao;
import com.dto.Address;
import com.dto.Customer;

@RestController
public class CustomerController {

	@Autowired
	CustomerDao customerDao;
	
	@Autowired
	AddressDao addressDao;
	
	@PostMapping("/register_customer")
	public void register(@RequestBody String response) {
		System.out.println(response);
		response.replaceAll("\"", "");
		String[] arr = response.split(",");
		String firstName = arr[0].replaceAll("\"", "").split(":")[1];
		String lastName = arr[1].replaceAll("\"", "").split(":")[1];
		String gender = arr[2].replaceAll("\"", "").split(":")[1];
		String houseNo = arr[3].replaceAll("\"", "").split(":")[1];
		String street = arr[4].replaceAll("\"", "").split(":")[1];
		String city = arr[5].replaceAll("\"", "").split(":")[1];
		long pincode = Long.parseLong(arr[6].replaceAll("\"", "").split(":")[1]);
		String state = arr[7].replaceAll("\"", "").split(":")[1];
		String country = arr[8].replaceAll("\"", "").split(":")[1];
		String emailId = arr[9].replaceAll("\"", "").split(":")[1];
		long phoneNumber = Long.parseLong(arr[10].replaceAll("\"", "").split(":")[1]);
		String loginId = arr[11].replaceAll("\"", "").split(":")[1];
		String password = arr[12].replaceAll("\"", "").split(":")[1];
		Address address = new Address(houseNo, street, city, pincode, state, country);
		addressDao.register(address);
		Customer customer = new Customer(firstName, lastName, gender, address, emailId, phoneNumber, loginId, password);
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
		addressDao.register(address);
		Customer customer = new Customer("ahmad", "ali", "male", address, "hello@gmail.com", 8989898989l, "ahmad12", "password");
		customerDao.register(customer);
	}
	
	@RequestMapping("/login_customer/{loginId}/{password}")
	public Customer loginUser(@PathVariable("loginId") String loginId, @PathVariable("password") String password) {
		return customerDao.verifyCustomerInfo(loginId, password);
	}
}
