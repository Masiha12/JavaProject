package com.syntax.GroupProject;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeTAskproject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner Scanner=new Scanner(System.in);
		System.out.println("Please Enter how many contries you want to store");
		int size=Scanner.nextInt();
		String []countries=new String[size];
		String[] capitals=new String[size];
		Scanner .nextLine();
		for(int i=0; i<size;i++) {
			System.out.println("Please enter the countries name");
			countries[i]=Scanner .nextLine();
			
			
			System.out.println("Please enter the capital"+countries[i]);
			capitals[i]=Scanner .nextLine();
		}

		System.out.println(Arrays.toString (countries));
		System.out.println(Arrays.toString (capitals ));
	}

}
