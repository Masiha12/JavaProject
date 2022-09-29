package com.syntax.class13;

public class StringReverseHw5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		
		//How would you reverse a String word by word? for example
		        // input=>This is sentence i want to reverse
		        // output=>sihT si ecnetnes i tnaw ot esrever
		
		String letter = "This is sentence i want to reverse";
		StringBuilder str = new StringBuilder(letter);
		System.out.println(str.reverse());
	}

	{

		String arr1 = "any sentence";
		String[] arr = arr1.split(" ");

		for (int k = 0; k < arr.length; k++) {
			for (int m = arr1.length() - 1; m >= 0; m--) {
				System.out.print(arr1.charAt(m));
				System.out.print(" ");

			}

		}
	}
}
