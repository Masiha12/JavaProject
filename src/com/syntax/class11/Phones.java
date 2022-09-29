package com.syntax.class11;

public class Phones {
/*
 * Create a Class “Phone”. Create 3 Objects of it: 
 * iPhone, Pixel, Samsung, 
 * with specific  attributes and behaviors.
 * 
 */ 
String name;
String model;
String color;
int storage;
String expensive;

void takeportraitphoto() {
	System.out.println("Iphone 13 pro take portrait photo with high quality.");
}

void playingmusic() {
	System.out.println("Pixel 6 pro play many types of music whith very high quality.");
}

void savingpower() {
	System.out.println("Samsung S22 svae battery charge very long.");
}

public static void main(String[] args) {

	Phones phone1 = new Phones();

	phone1.name = "Apple";
	phone1.model = "13 pro max";
	phone1.color = "Silver";
	phone1.storage = 128;
	phone1.expensive = "True";

	System.out.print("Made by " + phone1.name + " model " + phone1.model + " color " + phone1.color + "has expensive "
			+ phone1.expensive + " ");
	phone1.takeportraitphoto();

	System.out.println();

	Phones phone2 = new Phones();
	phone2.name = "pixel";
	phone2.model = "6 pro";
	phone2.color = "Gold";
	phone2.storage = 256;
	phone2.expensive = "false";

	System.out.print("Made by " + phone2.name + " model " + phone2.model + " color " + phone2.color + "has expensive "
			+ phone2.expensive + " ");
	phone2.playingmusic();

	System.out.println();

	Phones phone3 = new Phones();
	phone3.name = "Samsung";
	phone3.model = "Galaxy s22 ";
	phone3.color = "Blue";
	phone3.storage = 500;
	phone3.expensive = "true";

	System.out.print("Made by " + phone3.name + " model " + phone3.model + " color " + phone3.color + "has expensive "
			+ phone3.expensive + " ");
	phone3.savingpower();

	System.out.println();

}

}
