package com.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Product {
	@Id
	@GeneratedValue
	private int productId;
	private String productName;
	private String category;
	//brand
	//description
	private double weight;
	private int availableQuantity;
	private double price;
	private String createdDate;
	private String expiryDate;

	@ManyToOne
	@JoinColumn(name = "store_id")
	Store store;

	@OneToMany(mappedBy = "product")
	List<OrderDetails> orderDetails = new ArrayList<OrderDetails>();

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(String productName, String category, double weight, int availableQuantity, double price,
			String createdDate, String expiryDate, Store store) {
		super();
		this.productName = productName;
		this.category = category;
		this.weight = weight;
		this.availableQuantity = availableQuantity;
		this.price = price;
		this.createdDate = createdDate;
		this.expiryDate = expiryDate;
		this.store = store;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getAvailableQuantity() {
		return availableQuantity;
	}

	public void setAvailableQuantity(int availableQuantity) {
		this.availableQuantity = availableQuantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	public Store getStore() {
		return store;
	}

	public void setStore(Store store) {
		this.store = store;
	}

	public List<OrderDetails> getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(List<OrderDetails> orderDetails) {
		this.orderDetails = orderDetails;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", category=" + category
				+ ", weight=" + weight + ", availableQuantity=" + availableQuantity + ", price=" + price
				+ ", createdDate=" + createdDate + ", expiryDate=" + expiryDate + ", store=" + store + ", orderDetails="
				+ orderDetails + "]";
	}

}
