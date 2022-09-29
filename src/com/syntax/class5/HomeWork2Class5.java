package com.syntax.class5;

import java.util.Scanner;

public class HomeWork2Class5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		//Write a program for user to enter his/hers birth month. Based on the month define the season.
		//Example: if user is born in March, April, May → season =”Spring” 
		//if user is born in June, July, August → 
		//	season =”Summer”  etc …
			
		Scanner Scanner = new Scanner(System.in);
		

		System.out.println("please enter your birth month");
		String month = Scanner.next();
		String DataOfMonth=null;
		
		if (month.equals("March") || month.equals("April") || month.equals("May")) {
			DataOfMonth	=("Spring");
			
		} else if (month.equals("June") || month.equals("July") || month.equals("August")) {
			DataOfMonth=("Summer");
			
		} else if (month.equals("Septwber") || month.equals("October") || month.equals("November")) {
			DataOfMonth=("Fall");
			
		} else if (month.equals("December") || month.equals("January") || month.equals("feburuary")) {
			DataOfMonth=("winter");
				
			}else {
				System.out.println("You were born"+"winter");
			}
				
			}
			
			{
				
				
					{
						
					
				
		
	}

			}}
