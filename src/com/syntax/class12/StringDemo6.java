package com.syntax.class12;

public class StringDemo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String str="I love java programming";
     // Char returns us the character at specific index
   System.out.println(str.charAt(8));
   for(int i=0; i<str.length(); i++) {
	   
	   //print only the characters not spaces
	   if(!(str.charAt(i)==' ')) {
		   System.out.println(str.charAt(i));
	   
	   
   }
   
	}

	}}
