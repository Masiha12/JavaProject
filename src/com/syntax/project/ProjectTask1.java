package com.syntax.project;

import java.util.Arrays;
import java.util.Scanner;

public class ProjectTask1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		// Using Scanner create an array of integer values. After
     	// 	the array is created, calculate the sum of all stored
		// elements in that array.
		
	Scanner Scanner = new Scanner(System.in);
	System.out.println("Enter the Number of the array");
	int num1 = Scanner.nextInt();

	System.out.println("Enthe the second number");
	int number2 = Scanner.nextInt();
	System.out.println("Enthe the third number");
	int number3 = Scanner.nextInt();
	int sum = 0;
	int[] array = { num1, number2, number3 };
	for (int num2 : array) {
		sum += num2;
		System.out.println(" The total of sum number is =" + sum);
		System.out.println("----------------------");
		
		
		
		
		
		System.out.println("Please Enter the size of the array");
		int size=Scanner .nextInt();
		
		int[] arr=new int[size];
		
		for(int i=0;i<size; i++) {
			System.out.println("please enter an int number");
			arr[i]=Scanner .nextInt();
		}
		System.out.println(Arrays.toString(arr));
		
		
		
	}
	
	
	
	
	
	
	
}
	
	
}
