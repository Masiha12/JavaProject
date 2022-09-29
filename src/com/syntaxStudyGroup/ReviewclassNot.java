package com.syntaxStudyGroup;

import java.util.Scanner;

public class ReviewclassNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String country="Turkiye";
if(country.equals("Turkiye")||country.equals("Japan")|| country.equals("Span")){
	
	
	
	if(!country.equals("Korea")) {
		System.out.println("Welcome to usa");
		
		
	}
	
	Scanner Scanner=new Scanner(System.in);
	
    System.out.println("Are you from batch 14");
    String batch14=Scanner.next();
    if(batch14.equalsIgnoreCase("yes"))
    {
        System.out.println("You are amazing");
    }
    else 
    {
        System.out.println("You are good");
    }
}

	
	
}
	}


