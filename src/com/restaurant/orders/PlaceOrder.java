package com.restaurant.orders;

import java.util.ArrayList;

import com.restaurant.items.Item;
import com.restaurant.menu.Menu;

public class PlaceOrder {
	
	ArrayList<Order> orders = new ArrayList<>();
	ArrayList<Item> availableItems = new ArrayList<>();
	
	PlaceOrder(){
		
	}
	PlaceOrder(Menu menu){
		
	}
	public void orderItem(String item, int quantity){
		
	}
	public ArrayList<Order> getOrder(){
		return orders;
	}
}
