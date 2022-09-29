package com.syntax.Class4;

import java.util.Scanner;

public class HomeWork4Part3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * You are a loan specialist and you need to ask user what is the amount of loan is needed.
		 *  If loan is less or equal to 200,000 then you would lend the money
		 *   otherwise you would reject the client.
		 */
		
		
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter the amount of loan you need:");
	    
		int loan= scanner.nextInt();
		if(loan<=200000) {
			System.out.println("We can give you a loan");
		}else {
			System.out.println("Sorry! We can not give you the loan");
		}

}
}
