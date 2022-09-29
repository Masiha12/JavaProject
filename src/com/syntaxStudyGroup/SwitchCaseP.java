package com.syntaxStudyGroup;

import java.util.Scanner;

public class SwitchCaseP {

	public static void main(String[] args) {
		
		Scanner Scanner=new Scanner(System.in);

     
     System.out.println("What is the temperature?");
     int temp=Scanner .nextInt();
     String country=null;
     
     switch(temp) {
     case 30:
    	 country="bora bora";
    	 break;
    	 
     case 0:
    	 country="Antarctica";
    	 break;
     case 100:
    	 country="Turkye";
    	 break;
    	 default:
    		 country="Germany";
    		 break;
    	 
     }
     System.out.println("You should visit "+country);
	}

}
