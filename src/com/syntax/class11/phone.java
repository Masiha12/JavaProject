package com.syntax.class11;

public class phone {
	String make;
	String model;
	String color;
	int storage;
	double size;
	boolean cheap;
	void call(){
		System.out.println("calling.....");
	}
	void takePicture() {
		System.out.println("Taking pictures");
		
	}
public static void main(String[] args) {
	// name of class variable name=new name of class();
	phone iphone=new phone();
	iphone.make="Apple";
	iphone.model="Iphone 14";
	iphone.color="black";
	iphone.storage=128;
	iphone.size=6.8;
	iphone.cheap=false;
	System.out.println("Make"+iphone.make+"model"+iphone.model);
	iphone.call();
	System.out.println("*************");
	
	phone samsungphone=new phone();
	samsungphone.make="samsung";
	samsungphone.model="s22ultra";
	samsungphone.color="grey";
	samsungphone.storage=256;
	samsungphone.size=6.7;
	samsungphone.cheap=false;
	
	System.out.println(iphone.make);
	System.out.println(samsungphone.make);
	
}
}
