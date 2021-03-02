package com.dto;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Product{
	@Id
	@GeneratedValue
	private int productId;
	private String productName;
	private String category;
	private double price;
	private Date modelYear;
	
	@ManyToOne
	@JoinColumn(name="store_id")
	Store store;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(String productName,double price, String category, Date modelYear, Store store) {
		super();
		this.productName = productName;
		this.category = category;
		this.price = price;
		this.modelYear = modelYear;
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Date getModelYear() {
		return modelYear;
	}

	public void setModelYear(Date modelYear) {
		this.modelYear = modelYear;
	}

	public Store getStore() {
		return store;
	}

	public void setStore(Store store) {
		this.store = store;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", category=" + category
				+ ", price=" + price + ", modelYear=" + modelYear + ", store=" + store + "]";
	}

	
	
}
