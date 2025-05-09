package com.practice4;

public class Product {

	String name;
	double price;
	Product returnThis() {
		return this;
	}
	Product setName(String name) {
		this.name = name;
		return this;	
	}
	Product setPrice(double price) {
		this.price = price;
		return this;
	}
	void display() {
		System.out.println("Product name- "+name);
		System.out.println("Product price-"+price);
	}
	public static void main(String[] args) {
		Product p = new Product();
		p.returnThis().setName("Smartphone").setPrice(30000).display();	
		
	}
	
}
