package com.practice5;

public class Shape {
	double area, radius;
	
	public void calculateArea(double radius) {
		area = Math.PI * radius*radius;
		System.out.println(area);
	}
}
