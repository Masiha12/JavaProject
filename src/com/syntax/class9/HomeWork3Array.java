package com.syntax.class9;

public class HomeWork3Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create an array on integers and 
		//calculate the sum of all elements in an array;

		int sum=0;
		int num[]= {12, 8,3, 1,2,4};
		for( int i=0; i<num.length; i++) {
			sum+=num[i];
			
		}
		System.out.println("the sum number is ="+sum);
		
		
	}

}
