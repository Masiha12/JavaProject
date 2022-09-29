package com.syntax.Replit;

public class Main87 {
	
	
	
	
	//Create a class named 'Main' with specific attributes.

	//Create two objects of that class in which you will be assigning the following values and then print them.

	//carColor='Black'

	//carYear=2019

	//carMake='BMW'

	//carColor='White'

	//carYear=2018

	//carMake='Toyota'

	//**Expected Output:**

	
	//Car color is Black and car year is 2019 and car model is BMW
	//Car color is White and car year is 2018 and car model is Toyota
	
String make;
String color;
int year;
void drive() {
	System.out.println("Car color is " +color+" and car year is "+year+" and car model is "+make);
}
	public static void main(String[]args) {
		Main87 car1=new Main87();
		car1.make="BMW";
		car1.color="Black";
		car1.year=2019;
		car1.drive();
		
		
		
		
		Main87 car2=new Main87();
		car2.make="Toyota";
		car2.color="White";
		car2.year=2018;
		car2.drive();
	}
	
	
	
	
}
