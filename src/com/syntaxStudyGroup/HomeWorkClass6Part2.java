package com.syntaxStudyGroup;

import java.util.Scanner;

public class HomeWorkClass6Part2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Ask user to enter their country and capture it.
		 *  Once values are captured print which language user speaks.
		 */
		Scanner Scanner=new Scanner(System.in);
		System.out.println("Please enter your country");
		String country=Scanner .nextLine();
		String yourLanguage;
		switch(country) {
		case "Afghanistan":
			yourLanguage ="Dari";
			break;
		case "Usa":
			yourLanguage="English";
			break;
		case "indain":
			yourLanguage="Urdo";
			break;
			default:
			yourLanguage="Unknown";
		
		}
		System.out.println("Your country is "+country+" so your language is "+yourLanguage);
	}

}
