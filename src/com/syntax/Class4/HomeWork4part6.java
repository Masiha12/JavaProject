package com.syntax.Class4;

import java.util.Scanner;

public class HomeWork4part6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Create a Java program that will ask user to input city and temperature.
		//Your program should convert Fahrenheit into celsius and print 
		//“The temperature is the city  is ” 
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("what is the name of your city?");
		String user=scanner.nextLine();
		System.out.println("what is the temperature  of your city in farenheit?");
		double tempf= scanner.nextDouble();
	
		float tempc=(float)(tempf-32)*5/9;
		System.out.println("The Temperature in the "+user+" is "+tempc+" degree of C.");
	}

}
