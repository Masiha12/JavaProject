package com.syntax.Replit;

import java.util.Scanner;

public class Rep97 {

	private static final Object IE = null;
	private static Object ie;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Based on the user inputs program should give a correct answer.

If browser is Chrome or Chrome or CHROME or ChRoMe it should print the: 

"Proceed with Chrome browser"

If browser is firefox, FIREFOX or FireFOX it should print the: 

"Proceed with Firefox browser"

If browser is IE, ie or iE it should print the:

"browser.equals"

If any other browser it should print the:  

"Invalid browser"

		 */
		
		Scanner Scanner=new Scanner(System.in);
		System.out.println("Enter the browser name");
		String browser=Scanner.nextLine();
		if(browser.equalsIgnoreCase("Chrome")|| browser.equals("CHROME ")||browser.equals("ChRoMe")) {
			System.out.println("Proceed with Chrome browser");
		}else if(browser.equals("firefox")||browser.equals("FIREFOX")||browser.equals(" FireFOX")) {
			System.out.println("Proceed with Firefox browser");
		}else if(browser.equals(IE)||browser.equals(ie)||browser.equals("iE")) {
			System.out.println("browser.equals");
		}else {
			System.out.println("Invalid browser");
		}

	}
}
