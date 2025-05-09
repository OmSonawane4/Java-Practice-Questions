//Write a program where one constructor calls another constructor in the same class using this().
package com.constchaining;

public class Demo {
	protected Demo() {
		System.out.println("This is non parameterized constructor");
	}
	Demo(int a){
		this();
		System.out.println("This is a parameterised constructor");
	}
	
	Demo(int a, int b){
		this(1);
		System.out.println("This is a parameterised constructor 1.1");
	}
	
	Demo(int a, int b, int c){
		this(1,2);
		System.out.println("This is a parameterised constructor 1.2");
	}
	
	public static void main(String[] args) {
		Demo d = new Demo(1,2,3);
		
	}
}
