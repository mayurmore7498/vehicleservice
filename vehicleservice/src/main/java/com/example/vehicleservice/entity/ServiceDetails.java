package com.example.vehicleservice.entity;

import jakarta.persistence.*;

@Entity
public class ServiceDetails {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long detailId;
	
	private int quantity;
	private double itemPrice;
	
	@ManyToOne
	@JoinColumn(name="service_id")
	private ServiceRecord serviceRecord;
	
	@ManyToOne
	@JoinColumn(name="item_id")
	private ServiceItem serviceItem;

	public Long getDetailId() {
		return detailId;
	}

	public void setDetailId(Long detailId) {
		this.detailId = detailId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}

	public ServiceRecord getServiceRecord() {
		return serviceRecord;
	}

	public void setServiceRecord(ServiceRecord serviceRecord) {
		this.serviceRecord = serviceRecord;
	}

	public ServiceItem getServiceItem() {
		return serviceItem;
	}

	public void setServiceItem(ServiceItem serviceItem) {
		this.serviceItem = serviceItem;
	}
	
	

}
