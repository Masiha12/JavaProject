package com.syntax.project;

import java.util.Scanner;

public class ProjectTask2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Using Scanner create an array of countries. When an
		// array is created, retrieve all values from it and while
		// retrieving those values print capital for each country.
		Scanner Scanner = new Scanner(System.in);
		System.out.println(" please enter the name of the country");
		String countryone = Scanner.nextLine();
		System.out.println("please Enter another country");
		String countrytwo = Scanner.nextLine();
		System.out.println("Enter the country name");
		String countrythree = Scanner.nextLine();
		System.out.println("Enter another country");
		String countryfour = Scanner.nextLine();
		String[] country = { "Afghanistan", "Pakistan", "Iran", "US" };
		for (String countryname : country) {
			System.out.println("entred the country" + countryname + ",");
			if (countryname.equals("Afghanistan")) {
				System.out.println("the copital of " + countryname + " is Kabul");
			} else if (countryname.equals("Pakistan")) {
				System.out.println("the copital of" + countryname + " is isalmabad");

			} else if (countryname.equals("Iran")) {
				System.out.println("the copital of " + countryname + "is tehran ");
			} else if (countryname.equals("US")) {
				System.out.println("the copital of " + countryname + " is DC");
			} else {
				System.out.println(" the copital of" + countryname + " is unkwon");

			}
			System.out.println(" ");

		}

	}

}
