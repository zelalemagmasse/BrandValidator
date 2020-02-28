package com.eyob.brandvalidator.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;
@Component
public class Cart {

	 @Id
	    @GeneratedValue(strategy= GenerationType.AUTO)
	    private long id;
	 
	 private List<Item> purchasedList = new ArrayList<>();
	 
	 private List<Item> scannedList =new ArrayList<>();

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public List<Item> getPurchasedList() {
		return purchasedList;
	}

	public void setPurchasedList(List<Item> purchasedList) {
		this.purchasedList = purchasedList;
	}

	public List<Item> getScannedList() {
		return scannedList;
	}

	public void setScannedList(List<Item> scannedList) {
		this.scannedList = scannedList;
	};

	
	
}
