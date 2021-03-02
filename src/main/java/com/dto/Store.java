package com.dto;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Store {
	@Id
	@GeneratedValue
	private int storeId;
	private String storeName;
	private String sellerName;
	private String country;
	private String state;
	private String city;
	private String address;
	private long pincode;
	private long phone;
	private String emailId;

	@Column(unique = true)
	private String loginId;
	private String password;

	@OneToMany(mappedBy = "store")
	List<Items> items = new ArrayList<Items>();

	public Store() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Store(String storeName, String sellerName, String country, String state, String city, String address,
			long pincode, long phone, String emailId, String loginId, String password) {
		super();
		this.storeName = storeName;
		this.sellerName = sellerName;
		this.country = country;
		this.state = state;
		this.city = city;
		this.address = address;
		this.pincode = pincode;
		this.phone = phone;
		this.emailId = emailId;
		this.loginId = loginId;
		this.password = password;
	}

	public int getStoreId() {
		return storeId;
	}

	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPincode() {
		return pincode;
	}

	public void setPincode(long pincode) {
		this.pincode = pincode;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
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

	public List<Items> getItems() {
		return items;
	}

	public void setItems(List<Items> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "Store [storeId=" + storeId + ", storeName=" + storeName + ", sellerName=" + sellerName + ", country="
				+ country + ", state=" + state + ", city=" + city + ", address=" + address + ", pincode=" + pincode
				+ ", phone=" + phone + ", emailId=" + emailId + ", loginId=" + loginId + ", password=" + password
				+ ", items=" + items + "]";
	}

}
