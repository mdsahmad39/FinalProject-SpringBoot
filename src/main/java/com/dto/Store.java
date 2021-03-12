package com.dto;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Store {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int storeId;
	private String storeName;
	private String sellerName;
	private long phone;
	private String emailId;
	private boolean status = false;

	@Column(unique = true)
	private String loginId;
	private String password;

	@OneToOne
	@JoinColumn(name="address_id")
	Address address;

	@OneToMany(mappedBy = "store")
	@Fetch(value=FetchMode.SUBSELECT)
//	@JsonIgnore
	List<Product> items = new ArrayList<Product>();

	@OneToMany(mappedBy = "store")
	List<Orders> orders = new ArrayList<Orders>();

	public Store() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Store(String storeName, String sellerName, Address address, long phone, String emailId, String loginId,
			String password) {
		super();
		this.storeName = storeName;
		this.sellerName = sellerName;
		this.address = address;
		this.phone = phone;
		this.emailId = emailId;
		this.loginId = loginId;
		this.password = password;
	}
	
	

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public List<Product> getItems() {
		return items;
	}

	public void setItems(List<Product> items) {
		this.items = items;
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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
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

	public List<Orders> getOrders() {
		return orders;
	}

	public void setOrders(List<Orders> orders) {
		this.orders = orders;
	}

	@Override
	public String toString() {
		return "Store [storeId=" + storeId + ", storeName=" + storeName + ", sellerName=" + sellerName + ", phone="
				+ phone + ", emailId=" + emailId + ", status=" + status + ", loginId=" + loginId + ", password="
				+ password + ", address=" + address + ", items=" + items + ", orders=" + orders + "]";
	}

}
