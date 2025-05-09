package com.practice5;

public class Circle extends Shape {
	@Override
	public void calculateArea(double radius) {
		// TODO Auto-generated method stub
		super.calculateArea(radius);
	}
	
	public static void main(String[] args) {
		Circle c = new Circle();
		c.calculateArea(25);
	}
}
