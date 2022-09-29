package com.syntax.Class4;

import java.util.Scanner;

public class HomeWork4Paet2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create a Java program and store values of mortgage rate and mortgage price.
		 
		//First, program should check if rate is higher than 4.5 user will not buy a house, 
		
	//	otherwise user will consider buying. Once user decides to buy a house,
		
		//if price of the house is larger than 200000 than user will take a loan,
		
		//otherwise user will pay cash
		
		
		
		
		
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("What is your martgage Rate please?");
double MartGageRate= scanner.nextDouble();
double price;
    if(MartGageRate>4.5) {
    	System.out.println("you will not buy a house ");
    }else {
    	System.out.println("You can buy a house");
    	
    	System.out.println("What is your MartGage price?");
        price= scanner.nextDouble();
    	
        if(price>200000) {
        	System.out.println("You will take a loan");
        }else {
        	System.out.println("You can pay cash");
        }
		}
    
    	
   
 
        		
        	}
        }
    
    
	
	

