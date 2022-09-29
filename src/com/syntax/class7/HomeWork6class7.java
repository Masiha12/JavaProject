package com.syntax.class7;

import java.util.Scanner;

public class HomeWork6class7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 /*
		  * Declare a variable to store a price for a coffee.
		  *  Ask the user to pay for a coffee. 
		  *  Keep asking to pay for coffee until the user enters the EXACT amount .
		  *   If the user gives more than coffee price --> ask them to give less, 
		  *   if the user gives less money then ask to give more. 
		  *   Once user give EXACT amount print “Please enjoy your coffee	
		  */
		
		Scanner scanner=new Scanner(System.in);
		
		double price=5.99;
        double user=0.0;

        do {

            Scanner in=new Scanner(System.in);
            System.out.println("Please pay for the coffee");
            user=in.nextDouble();
            if(user>price) {
                System.out.println("Please give less than price");
                user=in.nextDouble();
            } else if(user<price) {
                System.out.println("Please give more than price");
                user=in.nextDouble();
            }
        }while(user!=price);

        System.out.println("Please enjoy your coffee");


    }


		}
		
		

	


