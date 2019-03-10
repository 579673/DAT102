package no.hvl.dat102.chap7;

public class Item {
	private String name;
	private int amount;
	private double price;
	
	public Item(String name, double price, int amount) {
		this.name = name;
		this.price = price;
		this.amount = amount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public String toString() {
		return name + "\n" + "Price: " + price + " | Amount: " + amount;
	}
}
