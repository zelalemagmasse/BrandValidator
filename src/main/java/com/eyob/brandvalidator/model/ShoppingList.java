package com.eyob.brandvalidator.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;
@Component
public class ShoppingList {

	
	 @Id
	    @GeneratedValue(strategy= GenerationType.AUTO)
	    private long id;
	 
	 private String shoppingList;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getShoppingList() {
		return shoppingList;
	}

	public void setShoppingList(String shoppingList) {
		this.shoppingList = shoppingList;
	}
	 
	 
}
