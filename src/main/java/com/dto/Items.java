package com.dto;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Items {
	@Id
	@GeneratedValue
	private int itemId;
	private String name;
	private double weight;
	private int count;
	private double price;
	
	@ManyToOne
	@JoinColumn(name="store_id")
	Store store;

	public Items() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Items(String name, double weight, int count, double price, Store store) {
		super();
		this.name = name;
		this.weight = weight;
		this.count = count;
		this.price = price;
		this.store = store;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	@Override
	public String toString() {
		return "Items [itemId=" + itemId + ", name=" + name + ", weight=" + weight + ", count=" + count + ", price="
				+ price + ", store=" + store + "]";
	}
	
}
