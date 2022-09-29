package com.syntaxclass2;

public class NonprimitiveDataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//string is just 1 example of non primitive data types

		String name="Asma";
		String address="123 address street";
		String phone="123 456 7890";
		int age=17;
		//string age="17"; // anything you put inside"" -> become string
		String character="A";
		// ctr+ space-> completes the statement
		// syso+ctlr+space
		System.out.println(name);
		// "My name is" + Asma
		System.out.println("My name is "+ name);
		
		// Asma is 17
		System.out.println(name  + "is"+ age);
		
		
		String fruit="apple";
		double price=1.99;
		
	  // the price of the apple is 1.99
		System.out.println("The price of the " + fruit+" is" +price);
		
		fruit="mango";
		price=5.99;
				// the price of the mango is 5.99
		System.out.println("The price of the " + fruit+" is" +price);
		
		/* to attach any value (int, double,bolean, char string etc)
		 * to a string we use +
		 * + next, to the string acts as concatenation
		 * 
		 * 
		 */
	}

}
