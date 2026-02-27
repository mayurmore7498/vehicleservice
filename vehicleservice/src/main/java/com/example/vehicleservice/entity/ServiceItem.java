package com.example.vehicleservice.entity;

import jakarta.persistence.*;

@Entity
public class ServiceItem {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long itemId;
	
	private String itemName;
	private double price;
	
	@ManyToOne
	@JoinColumn(name="center_id")
	private ServiceCenter serviceCenter;

	public Long getItemId() {
		return itemId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public ServiceCenter getServiceCenter() {
		return serviceCenter;
	}

	public void setServiceCenter(ServiceCenter serviceCenter) {
		this.serviceCenter = serviceCenter;
	}
	
	
	

}
