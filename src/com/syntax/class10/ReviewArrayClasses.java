package com.syntax.class10;

import java.util.Arrays;

public class ReviewArrayClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="Huma";
		String name1="Junel";
		String name2="Anna";
		//Array syntax;
		
		// not used in the real life.
		//one of the way to create an array.
		
		
		String []names=new String[] {"Huma", "Junel","Anna"};
		
		
		
		// last index is always sized-1because arrays 
		//index start from zero
		
		
	String []	dresses=new String[]{"pink Dress","cocktail","Summer Dress","Night Dress","pencil Dress"};
	System.out.println(dresses.length);
	
	for(int i=0; i<dresses.length; i++) {
		System.out.println("Lets try  "+dresses[i]);
	}
	//enhanced for loop;
		for(String dress:dresses) {
			System.out.println(dress);
		}
		System.out.println("**********");
		System.out.println(Arrays.toString(dresses));
		
	}

}
