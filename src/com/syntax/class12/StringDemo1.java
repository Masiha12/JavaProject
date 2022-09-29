package com.syntax.class12;

public class StringDemo1 {
	public static void main(String[] args) {
		String  str=new String("Java");
		
		
		//Proper way of creating an object
		String Str=new String("Java");
		//Simpler and shorter way provided by java creator// only works for string and wrapper class
		String name="Asma Alfadhli The Great";
		System.out.println(Str.length());
		System.out.println(name.length());
		
		if(name.length()>15) {
			System.out.println("Name can not be more thatn 15 characters");
		}
	}
	
	
	
	
	
}
