package com.practice3;

public class Manager extends Employee {
	@Override
	public void show() {
		// TODO Auto-generated method stub
		super.show();
		System.out.println("This is method of Manaager class");
	}
	public static void main(String[] args) {
		Manager m = new Manager();
		m.show();
	}
}
