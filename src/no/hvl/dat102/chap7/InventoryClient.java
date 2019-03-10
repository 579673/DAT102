package no.hvl.dat102.chap7;

import java.util.ArrayList;

public class InventoryClient {

	public static void main(String[] args) {
		
		ArrayList<Item> inventory = new ArrayList<>();
		
		for (int i = 0; i < 10; i++) {
			inventory.add(new Item("" + (char)(64+i), (double)(i*100), i));
		}
		
		for(Item i : inventory) {
			System.out.println(i);
		}
	}

}
