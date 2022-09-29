package com.syntax.class7;

import java.util.Scanner;

public class HomeWork5class7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Prompt the user to ask the name 3 times and print "Good afternoon +name...
	
		Scanner scanner=new Scanner(System.in);
		for(int i=1;i<=3;i++) {
			System.out.print( "What is your name? ");
			String name=scanner .nextLine();
			System.out.println("Good afternoon "+ name);
		} 
		
		
		
		

	}

}
