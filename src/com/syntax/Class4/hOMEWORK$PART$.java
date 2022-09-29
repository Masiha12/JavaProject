package com.syntax.Class4;

import java.util.Scanner;

public class hOMEWORK$PART$ {

	public static void main(String[] args) {
		// TODO Auto-generated method stuba
		
		
		//You are DMV representative and you need to ask customer their age.
		//If they are 18 and older you will issue a driver licence to them, 
		//otherwise you will offer them to get a learners permit.
		
		
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("please enter youe age");
		int age=scanner .nextInt();
		if (age>18) {
			System.out.println("we will get you your driver licince");
		}else {
			System.out.println(" You will need to get a learner primit");
		}
		

	}

}
