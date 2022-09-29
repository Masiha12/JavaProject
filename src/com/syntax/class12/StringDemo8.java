package com.syntax.class12;

public class StringDemo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String str="I am always confused";
   System.out.println(str.indexOf("a"));
   System.out.println(str.indexOf("s"));
   System.out.println(str.indexOf(" "));
   System.out.println(str.indexOf("2"));
   
  // SUbstring gives you the smaller string from a string we can start the starting
 //  part to this method and it will return us the substring from that index 
   
   System.out.println(str.substring(5));
	}

}
