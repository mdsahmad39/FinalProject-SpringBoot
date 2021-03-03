package com.dto;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Orders {
	@Id
	@GeneratedValue
	private int ordersId;
	private String ordersStatus;
	private String ordersDate;

	@ManyToOne
	@JoinColumn(name = "store_id")
	Store store;

	@ManyToOne
	@JoinColumn(name = "user_id")
	Customer customer;

//	@OneToMany(mappedBy = "orders")
//	List<OrderDetails> orderDetails = new ArrayList<OrderDetails>();

	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Orders(String orderStatus, String orderDate, Store store, Customer customer) {
		super();
		this.ordersStatus = orderStatus;
		this.ordersDate = orderDate;
		this.store = store;
		this.customer = customer;
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
