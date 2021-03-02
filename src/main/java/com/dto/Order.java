package com.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Order {
	@Id
	@GeneratedValue
	private int orderId;
	private String content;
	private double weight;
	private int count;
	private double price;
	
	@ManyToOne
	@JoinColumn(name="store_id")
	Store store;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	Customer customer;

	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Order(int orderId, String content, double weight, int count, double price, Store store, Customer customer) {
		super();
		this.orderId = orderId;
		this.content = content;
		this.weight = weight;
		this.count = count;
		this.price = price;
		this.store = store;
		this.customer = customer;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
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
		return "Order [orderId=" + orderId + ", content=" + content + ", weight=" + weight + ", count=" + count
				+ ", price=" + price + ", store=" + store + ", customer=" + customer + "]";
	}
	
}
