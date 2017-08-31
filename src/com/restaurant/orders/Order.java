package com.restaurant.orders;

import com.restaurant.items.Item;

public class Order {
	String name;
	int quantity;
	
	Order(){
		this.name = "";
		this.quantity = 0;
	}
	Order(Item item, int quantity){
		this.name = item.toString();
		this.quantity = quantity;
	}
}
