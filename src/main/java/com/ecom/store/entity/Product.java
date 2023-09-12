package com.ecom.store.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Product {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column
	private String manufacturer;
	
	@Column
	private double price;
	
	public Product(long id, String manufacturer, double price) {
		this.id = id;
		this.manufacturer = manufacturer;
		this.price = price;
	}
	
	public Product() {
		
	}

	public long getId() {
		return id;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public double getPrice() {
		return price;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	
}
