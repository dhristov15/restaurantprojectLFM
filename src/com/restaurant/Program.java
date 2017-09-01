package com.restaurant;

import com.restaurant.items.Coffee;
import com.restaurant.items.Item;
import com.restaurant.items.Juices;
import com.restaurant.items.Tea;
import com.restaurant.items.nonvegitems.NonVegSandwich;
import com.restaurant.items.vegitems.VegSandwich;
import com.restaurant.menu.Menu;
import com.restaurant.orders.PlaceOrder;
import com.restaurant.orders.Order;
import java.util.Scanner;

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
		//Menu.removeItem(vegSandwich);
		//Menu.removeItem(espresso);
		//Menu.displayItems();
		//ArrayList<Item> menu = Menu.getItems();
		//System.out.println(menu);
		
		System.out.println("What do you want to order?");
		System.out.println("1. Apple Juice");
		System.out.println("2. Tuna Sandwich");
		System.out.println("3. Espresso");
		System.out.println("4. Vegan Sandwich");
		System.out.println("5. Black Tea");
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Your choice: ");
		int choice = keyboard.nextInt();
		Item orderedItem = null;
		
		switch(choice) {
		case 1:
			orderedItem = appleJuice;
			break;
		case 2:
			orderedItem = tunaSandwich;
			break;
		case 3:
			orderedItem = espresso;
			break;
		case 4:
			orderedItem = vegSandwich;
			break;
		case 5:
			orderedItem = blackTea;
			break;
		}
		
		
		Scanner keyboard2 = new Scanner(System.in);
		System.out.print("Enter quantity: ");
		int quantity = keyboard2.nextInt();

		PlaceOrder order = new PlaceOrder();
		Order orderOne = new Order(orderedItem, quantity);
		order.orderItem(orderOne);
		//order.orderItem("Tuna Sandwich", 1);
		System.out.print("Your order is: ");
		order.displayOrder(orderOne);
		System.out.print("Your bill is: ");
		//System.out.println(PayBill.amountToBePayed(order));
		//System.out.println(PayBill.amountToBePayed(orderOne));
		System.out.println("$" + quantity * orderedItem.getCost());
		}
}
