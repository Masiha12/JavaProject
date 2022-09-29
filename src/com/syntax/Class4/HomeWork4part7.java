package com.syntax.Class4;

import java.util.Scanner;

public class HomeWork4part7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*Write a program to ask user to enter numbers of worked years and annual salary. 
		  If user worked for more or equals to 5 years than user is eligible for the bonus,
		  otherwise he is not. Once user is eligible and salary is larger than 50000 than bonus = 5000,
		  otherwise bonus=3000.*/
		
		
		Scanner scanner=new Scanner (System.in);
    System.out.println("How many years have you worked?");
    int wy=scanner.nextInt();
    if (wy>=5) {
    	System.out.println("You are eligible for the bonus");
    	System.out.println("How much was your salary?");
    	int salary=scanner .nextInt();
    	if(salary>50000) {
    		System.out.println("you are eligible for 5000");
    	} else {
    		System.out.println("You are eligible for 3000");
    	}
    }else {
    	System.out.println("sorry, you are not eligible for the bouns");
    	
    }
	}

}
