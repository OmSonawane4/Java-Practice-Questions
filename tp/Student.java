//Create a class Student with fields name and age. 
//Use this keyword to initialize fields through a constructor when constructor parameters have the same name as class fields.
package com.tp;

public class Student {
	String name;
	int age;
	
	public Student(String name, int age){
		this.name = name;
		this.age = age;
	}
	public void display() {
		System.out.println("Name- " + name + ", Age- " + age);

	}
	public static void main(String[] args) {
		Student s = new Student("Om",22);
		s.display();
		
	}
}
