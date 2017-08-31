package com.restaurant.menu;

import java.util.ArrayList;

import com.restaurant.items.Item;

public class Menu {
 static ArrayList<String> items = new ArrayList<>();
	
	public static void addItem(Item item) {
		items.add(item.toString());
	}
	public static void displayItems() {
		System.out.println(items.toString());
	}
	public static ArrayList<String> getItems() {
		return items;
	}
	public static void removeItem(Item item) {
		int itemIndex = 0;
		for(int i=0;i<items.size();i++) {
			if(item.equals(item)) {
				itemIndex = items.indexOf(items.get(i));
			}
		}
		items.remove(itemIndex - 1);
	}
}
