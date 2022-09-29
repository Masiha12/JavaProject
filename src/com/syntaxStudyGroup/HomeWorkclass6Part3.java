package com.syntaxStudyGroup;

import java.util.Scanner;

public class HomeWorkclass6Part3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Allow user to enter grade (A, B, or C etc...) and then provide explanation:
		 *  A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable.
		 *   At the end your program should print which grade was entered by a user with explanation.	
		 */
		
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter your garde");
		char grade=input .next().charAt(0);
		if(grade=='A') {
			System.out.println("Your grade is Excellent");
			
		}else if(grade=='B') {
			System.out.println("Your garde is Good");
		}else if(grade=='C') {
			System.out.println("Your grade is Average");
		}else if(grade=='D') {
			System.out.println("Your grade is Bad");
		}else {
			System.out.println("Your grade is Not Acceptable");
			
		}
			
			
			String result;
			switch(grade) {
			case 'A':
			result="Excellent";
			break;
			case 'B':
				result="Good";
				break;
			case 'C':
				result="Bad";
				break;
				default:
				result="not acceptable";
			}
			System.out.println("Your grade is "+result);
			
			
		}
	

}
