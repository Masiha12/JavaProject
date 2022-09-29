package com.syntax.class10;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner Scanner=new Scanner(System.in);
System.out.println("Please Enter the number of dresses you want to buy");
     int numberOfDresses=Scanner.nextInt();
     double[]prices=new double[numberOfDresses];
     for(int i=0; i<numberOfDresses; i++) {
    	 System.out.println("Please enter the price of dress no"+(i+1));
    	 prices[i]=Scanner.nextDouble();
     }
     double sum=0;
     System.out.println(Arrays.toString(prices));
     for(double price:prices) {
    	 sum+=price;
    	 
     }
     System.out.println("Total for all the dresses="+sum);
	}

}
