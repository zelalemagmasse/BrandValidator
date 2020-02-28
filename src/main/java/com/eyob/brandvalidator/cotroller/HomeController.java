package com.eyob.brandvalidator.cotroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.eyob.brandvalidator.model.Cart;
import com.eyob.brandvalidator.model.Item;
import com.eyob.brandvalidator.model.ShoppingList;
import com.eyob.brandvalidator.repositories.ItemRepository;
import com.eyob.brandvalidator.service.FdaUserImpl;
import com.eyob.brandvalidator.service.Util;


@Controller
public class HomeController {

	@Autowired
	private Util util;
	
	@Autowired
	private Cart cart;
	
	@Autowired
	private FdaUserImpl fdauser;
	
	@Autowired 
	private ItemRepository itemRepository;
	
	@RequestMapping("/")
	public String myHomePage(Model model) {
		model.addAttribute("shoppingList", new ShoppingList());
		return "homepage";
	}
	
	@RequestMapping("/checkitem")
	public String checkItem(Model model,ShoppingList shoppingList) {
		
	   List<String>purchasedList =  util.stringSplitter(shoppingList.getShoppingList());
	  
	   cart = fdauser.recallListFinderFromFDAApi(util.cartMaker(purchasedList,cart));
	   model.addAttribute("items",cart.getScannedList());
		return "advisory";
	}
	 @RequestMapping("/item/detail/{id}")
	    public String follow (@PathVariable("id") long id, Model model) {

	        Item item = itemRepository.findById(id).get();
	        model.addAttribute("itemDetail", item);
	        return "itemdetail";
	    }
}
