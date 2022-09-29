package com.syntax.class7;

import java.util.Scanner;

public class Task6Class7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Declare a variable to store a price for a coffee. 
		//Ask the user to pay for a coffee.
		// asking to pay for coffee until the user enters the EXACT amount .
	//	If the user gives more than coffee price --> ask them to give less,
	//	if the user gives less money then ask to give more.
	//	Once user give EXACT amount print “Please enjoy your coffee.
		
		Scanner scanner=new Scanner(System.in);
		double price=10.99;
		double user;
			do {
				System.out.println("Please pay for your coffee");
				 user=scanner .nextDouble();
			
			if(user>10.99) {
				System.out.println("Please pay less\n");
			}else if(user<10.99) {
				System.out.println("Please pay more\n");
			}else {
				System.out.println("please enjoy your coffee\n");
			}
			 
			}while(price!=user);
	}

}
