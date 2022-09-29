package com.syntax.class12;

import java.util.Scanner;

public class StringHomeWork1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  /*
   * Write a program that reads two people's first
names and if they expecting boy or girl? 
Based on the input suggests a name for a baby:
Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? boy
Suggested baby name: DANRY
   */
		
	Scanner Scanner = new Scanner(System.in);

	System.out.println("plese enter dad's first name");
	String dadName = Scanner.nextLine();
	System.out.println("Please enter mom's first name");
	String momName = Scanner.nextLine();
	System.out.println("what is the baby gender?");
	String babygender = Scanner.nextLine();
	if (babygender.equals("girl")) {
		System.out.println(momName.substring(0, momName.length() / 2)	
				+ dadName.substring(dadName.length() / 2)
				+ " will be a nice name for her");

	} else {
		System.out.println(dadName.substring(0, dadName.length() / 2)
				+ momName.substring(momName.length() / 2)
				+ " will be a nice name for him");
	}
	String motherName = "Mary";
    String fatherName = "Daniel";
    boolean isBoy = false;

    if (isBoy) {
        String firstHalf = fatherName.substring(0, fatherName.length() / 2);
        String secondHalf = motherName.substring(motherName.length() / 2);
        System.out.println(firstHalf + secondHalf);

    } else {
        String firstHalf = motherName.substring(0, motherName.length() / 2);
        String secondHalf = fatherName.substring(fatherName.length() / 2);
        System.out.println(firstHalf + secondHalf);

    }
}

}


