package com.syntax.class11;

public class Dog{	
		// State 
	// attributes/properties/fields
	String name;
	String color;
	String breed;
	double weight;
	int age;
	public char[] eat;
	//These are the behaviors of dog
	void bark() {
		System.out.println("Barking.....");
	}
		
void sleep() {
	System.out.println("Dog is sleeping");
}
	
	public static void main(String[]args) {
		
		// creating object from a class
		// new dog();=>it create an object of class Dog
	Dog dog1=new Dog();
	// calling a behavior on an object
	dog1.bark();
	dog1.sleep();
		
	}

	public void drink() {
		// TODO Auto-generated method stub
		
	}

	public void eat() {
		// TODO Auto-generated method stub
		
	}
		
		
		
	

}
