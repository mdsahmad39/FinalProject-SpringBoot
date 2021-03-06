package com.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class OrderDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orderDetailsId;
	private double purchasedWeight;
	private int purchasedQuantity;
	private double totalPrice;

	@ManyToOne
	@JoinColumn(name = "orders_id")
	Orders orders;

	@ManyToOne
	@JoinColumn(name = "product_id")
	Product product;

	public OrderDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrderDetails(double purchasedWeight, int purchasedQuantity, double totalPrice, Orders order,
			Product product) {
		super();
		this.purchasedWeight = purchasedWeight;
		this.purchasedQuantity = purchasedQuantity;
		this.totalPrice = totalPrice;
		this.orders = order;
		this.product = product;
	}

	public int getOrderDetailsId() {
		return orderDetailsId;
	}

	public void setOrderDetailsId(int orderDetailsId) {
		this.orderDetailsId = orderDetailsId;
	}

	public double getPurchasedWeight() {
		return purchasedWeight;
	}

	public void setPurchasedWeight(double purchasedWeight) {
		this.purchasedWeight = purchasedWeight;
	}

	public int getPurchasedQuantity() {
		return purchasedQuantity;
	}

	public void setPurchasedQuantity(int purchasedQuantity) {
		this.purchasedQuantity = purchasedQuantity;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Orders getOrder() {
		return orders;
	}

	public void setOrder(Orders order) {
		this.orders = order;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "OrderDetails [orderDetailsId=" + orderDetailsId + ", purchasedWeight=" + purchasedWeight
				+ ", purchasedQuantity=" + purchasedQuantity + ", totalPrice=" + totalPrice + ", order=" + orders
				+ ", product=" + product + "]";
	}

}
