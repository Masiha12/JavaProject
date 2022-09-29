package com.syntax.class5;

import java.util.Scanner;

public class HomeWorkClass5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*
	 * Write a program that will ask user to input inputs the current time (use 24 hour format).
Based on the given time define:
	 */
		
Scanner scanner=new Scanner (System.in);
System.out.println(("please Enter the time"));
int hr = scanner.nextInt();

if (hr >= 1 && hr <= 11) {
	System.out.println("Morning");
} else if (hr >= 12 && hr <= 15) {
	System.out.println("Afternoon");
} else if (hr >= 16 && hr <= 20) {
	System.out.println("Evening");
} else if (hr >= 21 && hr <= 24) {
	System.out.println("Night");

} else {
	System.out.println("invalid time");
	
	System.out.println("--------");
	
	//second way of doing the code
	
	String timeOfTheDay;
	if (hr >= 1 && hr <= 11) {
		timeOfTheDay = "Morning";
	} else if (hr >= 12 && hr <= 15) {
		timeOfTheDay = "Afternoon";
	} else if (hr >= 16 && hr <= 20) {
		timeOfTheDay = "Evening";

	} else if (hr >= 21 && hr <= 24) {
		timeOfTheDay = "Night";
	} else {
		System.out.println("Wrong number is entered");
		timeOfTheDay = "Invalid";
	}

	{
	}

}
}
}