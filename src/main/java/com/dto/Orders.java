package com.dto;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Orders {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ordersId;
	private String ordersStatus;
	private String ordersDate;
//	private String trackNumber;

	@ManyToOne(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	@JoinColumn(name = "store_id")
	Store store;

	@ManyToOne(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	@JoinColumn(name = "user_id")
	Customer customer;

	@OneToMany(mappedBy = "orders", fetch=FetchType.LAZY)
	@Fetch(value=FetchMode.SUBSELECT)
	@JsonIgnore
	List<OrderDetails> orderDetails = new ArrayList<OrderDetails>();

	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Orders(String orderStatus, String orderDate, Store store, Customer customer, List<OrderDetails> orderDetails) {
		super();
		this.ordersStatus = orderStatus;
		this.ordersDate = orderDate;
		this.store = store;
		this.customer = customer;
		this.orderDetails = orderDetails;
	}
	
	

	public List<OrderDetails> getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(List<OrderDetails> orderDetails) {
		this.orderDetails = orderDetails;
	}

	public int getOrderId() {
		return ordersId;
	}

	public void setOrderId(int orderId) {
		this.ordersId = orderId;
	}

	public String getOrderStatus() {
		return ordersStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.ordersStatus = orderStatus;
	}

	public String getOrderDate() {
		return ordersDate;
	}

	public void setOrderDate(String orderDate) {
		this.ordersDate = orderDate;
	}

	public Store getStore() {
		return store;
	}

	public void setStore(Store store) {
		this.store = store;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + ordersId + ", orderStatus=" + ordersStatus + ", orderDate=" + ordersDate + ", store="
				+ store + ", customer=" + customer + "]";
	}

}
