package com.syntax.class9;

public class AllementsFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] iceCream= {"vanilla","chocolate","pistashio","kulfi","mango"};
System.out.println(iceCream[0]);
System.out.println(iceCream[1]);
//how to get all values?
		for(int i=0;i<iceCream.length; i++) {
			System.out.print(iceCream[i]+" ");
		}
	}

}
