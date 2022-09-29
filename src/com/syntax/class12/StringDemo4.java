package com.syntax.class12;

public class StringDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//String str=" i love java ";
       // System.out.println(str);
        /*
         * Remove the spaces before and after the
         * String but not the ones which are present in between
         /
        System.out.println(str.trim());

        String str2="Java is Very easy";
        /
         * startsWith=> checks if a String starts with a specific letter or word
         * endsWith=> checks if a String Ends with a specific letter or word
         * contains=> checks if a String Contains a specific letter or word
         /
        System.out.println(str2.startsWith("J"));
        System.out.println(str2.endsWith("y"));
        /
         * Method chaining helps us call multiple methods on a single line one method after an other
         */
       // System.out.println(str2.toLowerCase().contains("very"));

  //  }
	//}

String str2="java is love java ";
System.out.println(str2);
/*
 * Remove the spaces before and after the
 * String but not the ones which are present in between
 /
System.out.println(str.trim());

String str2="Java is very easy";
/
 * startsWith=> checks if a String starts with a specific letter or word
 * endsWith=> checks if a String Ends with a specific letter or word
 * contains=> checks if a String Contains a specific letter or word
 */
System.out.println(str2.startsWith("i"));
System.out.println(str2.endsWith(" "));
System.out.println(str2.contains("very"));


}}
