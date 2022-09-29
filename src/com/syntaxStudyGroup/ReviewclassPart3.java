package com.syntaxStudyGroup;

import java.util.Scanner;

public class ReviewclassPart3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double savings=200000;
boolean freeTime=true;
String season="summer";
if(savings>200000&&freeTime && season.equals("summer")) {
	System.out.println("Lets go to Bora Bora");
}else {
	System.out.println("I need time and money");
	
	System.out.println("-------------");
	
	
	Scanner scanner=new Scanner(System.in);
	     System.out.println("Please enter if you are comfortable with"
	+ " java logical operators now");
	     
	     boolean goodWithOp=scanner .nextBoolean();
	     if(!goodWithOp) {
	    	 System.out.println("Do some resaerch solve some repls and take some rest");
	     }
	     
}


	}

}
