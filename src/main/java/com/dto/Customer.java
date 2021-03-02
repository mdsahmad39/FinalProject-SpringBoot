package com.dto;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Customer {
	@Id
	@GeneratedValue
	private int userId;
	private String firstName;
	private String lastName;
	private String gender;
	private String address;
	private String emailId;
	private long phoneNumber;

	@Column(unique = true)
	private String loginId;
	private String password;
//
//	@OneToMany(mappedBy = "customer")
//	List<Order> orders = new ArrayList<Order>();

	public Customer() {
	}

	public Customer(String firstName, String lastName, String gender, String address, String emailId,
			long phoneNumber, String loginId, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.address = address;
		this.emailId = emailId;
		this.phoneNumber = phoneNumber;
		this.loginId = loginId;
		this.password = password;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Customer [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", gender="
				+ gender + ", address=" + address + ", emailId=" + emailId + ", phoneNumber=" + phoneNumber
				+ ", loginId=" + loginId + ", password=" + password + ", orders= ]";
	}

}
