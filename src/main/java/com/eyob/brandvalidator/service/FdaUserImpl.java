package com.eyob.brandvalidator.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eyob.brandvalidator.model.Cart;
import com.eyob.brandvalidator.model.Item;
import com.eyob.brandvalidator.model.recall.Recall;
import com.eyob.brandvalidator.repositories.ItemRepository;
@Service
public class FdaUserImpl implements FdaUser {
	@Autowired
	private RecallSearchServiceImpl searchService;
	
	@Autowired 
	private ItemRepository itemRepository;

/*
	ArrayList<String> recallList = new ArrayList<>();
	ArrayList<String> resultList = new ArrayList<>();
	
	public Cart recallListFinder(Cart userCart){
		recallList.add("orange");
		recallList.add("banana");
		List<Item> itemPurchased  = userCart.getPurchasedList();
	
		for(Item item: itemPurchased) {
			if(recallList.contains(item.getProducName())) {
				item.setProdutFlag(true);
				userCart.getScannedList().add(item);
			}
			else {
				item.setProdutFlag(false);
			userCart.getScannedList().add(item);
			}
			
		}
	return userCart;
	}
	*/
	
	@Override
	public Cart recallListFinderFromFDAApi(Cart userCart) {
		
		List<Item> itemPurchased  = userCart.getPurchasedList();
		for(Item item: itemPurchased) {
		List<Recall> recalls=	searchService.fechRecallSearchResult(item.getProducName());
		if(recalls.size()>0) {
			item.setProdutFlag(true);
			item.setFdaAdvisory("THIS PRODUCT IS RECALLED");
			for(Recall recall: recalls) {
				saveItem(recall,item);
			}
			
			itemRepository.save(item);
			userCart.getScannedList().add(item);
		}
		else {
			item.setProdutFlag(false);
			item.setFdaAdvisory(" ");
			itemRepository.save(item);
		userCart.getScannedList().add(item);
		}
		}
		return userCart;
	}

private void saveItem(Recall recall, Item item) {
	// TODO Auto-generated method stub
	 item.setProductDescription(recall.getProduct_description().substring(0, 100));
	 item.setCountryManufactured(recall.getCountry());
	 item.setCityManufactured(recall.getCity());
}

	
	
}
