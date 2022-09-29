package com.syntax.Class4;

import java.util.Scanner;

public class HomeWork4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Write a program to store a boolean value of whether user has diploma or not.
		//If user has a diploma, you should say congratulations, 
		//otherwise program should suggest to get a degree.
		//Then if user has a degree program should check a GPA score.
	 //	If GPA score is higher or equals to 3.5 → output should say 
		//“You are eligible for scholarship”, otherwise → “You should have studied harder” .
		
		
		
		Scanner Scanner= new Scanner(System.in);
		System.out.println("do you have a diploma please enter true or false");
		
		boolean hasDiploma=Scanner.nextBoolean();
		
		if(hasDiploma){
			System.out.println("congartulation");
			System.out.println("what is your gpa score please");
			double gpa=Scanner.nextDouble();
			if(gpa>=3.5) {
				
			System.out.println("You are eligible for scholarship");
				
			}
				System.out.println("You should study hard");
		}else 
			System.out.println("you shuld get a dgree");
		}
			
		
				
				
				
				
				}
			
		

	


