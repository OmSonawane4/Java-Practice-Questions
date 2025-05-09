// Create a superclass Shape with a method calculateArea(). 
// Create a subclass Circle that overrides it. Use super to call the Shape version of calculateArea() from Circle.
package com.practice5;

public class Shape {
	double area, radius;
	
	public void calculateArea(double radius) {
		area = Math.PI * radius*radius;
		System.out.println(area);
	}
}
