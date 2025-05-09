//Create a class Box with length, width, and height. 
//Create a method to calculate volume. Use this to refer to the current object while setting values.
package com.practice;

public class Box {
	int length;
	int width;
	int height;
	
	Box(int length, int width, int height){
		this.length = length;
		this.width = width;
		this.height = height;
	}
	
	public double displayVolume() {
		double volume = length*width*height;
		return volume;
	}
	
	public static void main(String[] args) {
		Box b = new Box(20,30,10);
		
		System.out.println(b.displayVolume());
	}
}
