package com.syntax.class12;

public class StringDemo9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Replacement
		String str="Batch 14 is good 81247818!@##%#^ ASAKBSAKJSBN kajbjakfdnb";
		
		//replace method replaces one string with another in string 
		
		// replaceAll it takes a pattern and replace all the characters that follow that pattern 
        System.out.println(str.replace("good", "Excellent"));
        System.out.println(str.replaceAll("[g-z]", "a"));
	}

}
