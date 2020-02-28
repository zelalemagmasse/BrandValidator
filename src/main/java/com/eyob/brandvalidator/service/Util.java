package com.eyob.brandvalidator.service;


import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eyob.brandvalidator.model.Cart;
import com.eyob.brandvalidator.model.Item; 
@Service
public class Util {

	@Autowired
	private Cart cart;
	
	@Autowired
	private Item item;
	
 private final String fdaUrl = "https://www.fda.gov/about-fda/open-government-fda-data-sets/recalls-data-sets. ";
	
	public List<String> stringSplitter(String oneString){
		//Splitter commaSplitter = Splitter.on(',').omitEmptyStrings().trimResults();
		String result[] = oneString.trim().split("\\s*,\\s*");
		
		List<String> spllitedItem = Arrays.asList(result);  
		//Iterable<String> spllitedItem = commaSplitter.split(oneString); 
		return spllitedItem;
	}
	
	public Cart cartMaker(List<String> purchasedList,Cart cart) {
		
		for(String purchasedItem: purchasedList) {
			item = new Item();
			item.setProducName(purchasedItem);
			cart.getPurchasedList().add(item);
		}
		return cart;
	}
	
	
}
