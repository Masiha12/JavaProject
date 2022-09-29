package com.syntax.Class4;

import java.util.Scanner;

public class HomeWork4Part5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		//Create a Java program that will ask if user has a credit card or not.
	//	If you user does not have a credit card then offer them. 
	//	If they do have one ask what is balance on the card?
	
	 //   If balance of the card is larger than 1000, tell them to pay off immediately,
	  //  otherwise you can tell them that they can spend more.

		Scanner scanner=new Scanner(System.in);
		System.out.println("do you have a cridet card please say true or false");
		
	    boolean UserHascreditCard=scanner.nextBoolean();
	 
       System.out.println("how much money is on the card");
       int Balance=scanner.nextInt();
       if(Balance>1000) {
    	   System.out.println("You Should Pay off immidiately");   
      }else {
			System.out.println("You will spend more");
		
		}
       
	}
	
}

