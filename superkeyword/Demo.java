package com.superkeyword;

public class Demo extends Tp{
	
	@Override
	public void m1() {
		System.out.println("This is a m11 updated");
	}
	
	void display() {
		this.m1();
		super.m1();
	}
	public static void main(String[] args) {
		Demo d = new Demo();
		d.display();
	}
}
