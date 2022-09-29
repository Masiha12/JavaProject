package com.syntax.class11;

public class Dogs {

	//Homework2// Create a Dog Class and create 3 different objects of it:
	//Husky, Bulldog, Laboratory  with specific  attributes and behaviors.
	
	String name;
	String color;
	String gender;
	int age;
	double weight;

	void eat() {
		System.out.println("Dogs is eating right now");
	}
	void drink() {
		System.out.println("Dog is drinking water....");
	}
	void run() {
		System.out.println("Dog can run so fast.....");
	}
	public static void main(String[] args) {
		Dogs dog1 = new Dogs();
		dog1.name = "Husky";
		dog1.color = "white";
		dog1.age = 2;
		dog1.weight = 2.4;
		dog1.eat();
		System.out.println("-----------------------------------");
		Dogs dog2 = new Dogs();
		dog2.name = "Bulldog";
		dog2.color = "Black";
		dog2.age = 1;
		dog2.weight = 2.1;
		dog2.drink();
		System.out.println("--------------------------------------");
		Dogs dog3 = new Dogs();
		dog3.name = "Laboratory";
		dog3.color = "black and white";
		dog3.age = 5;
		dog3.weight = 4.2;

		dog3.run();
	}
}