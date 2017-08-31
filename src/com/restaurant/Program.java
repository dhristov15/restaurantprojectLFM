package com.restaurant;

import com.restaurant.items.Coffee;
import com.restaurant.items.Item;
import com.restaurant.menu.Menu;
import com.restaurant.items.Juices;
import com.restaurant.items.Tea;
import com.restaurant.items.nonvegitems.NonVegSandwich;
import com.restaurant.items.vegitems.VegSandwich;

public class Program {
	public static void main(String[] args) {
		Item appleJuice = new Juices("Apple Juice", 1.99); 
		Item tunaSandwich = new NonVegSandwich("Tuna Sandwich", 2.99);
		Item espresso = new Coffee("Espresso", 2.49);
		Item vegSandwich = new VegSandwich("Vegan Sandwich", 1.49);
		Item blackTea = new Tea("Black Tea", 0.99);
		Menu.addItem(appleJuice);
		Menu.addItem(tunaSandwich);
		Menu.addItem(espresso);
		Menu.addItem(vegSandwich);
		Menu.addItem(blackTea);
		Menu.removeItem(vegSandwich);
		Menu.removeItem(espresso);
		Menu.displayItems();
	}
}
