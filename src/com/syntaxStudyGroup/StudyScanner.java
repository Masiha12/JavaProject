package com.syntaxStudyGroup;

import java.util.Scanner;

public class StudyScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter height in inches: ");
        Scanner input = new Scanner(System.in);

        int height=input.nextInt();

        if(height<=60) {
            System.out.println("Short");

        }else if (height>=60 && height<=72) {
            System.out.println("Medium");

        }else if (height>=72) {
            System.out.println("Tall");
            System.out.println("--------");
            
            
            
            
            Scanner scanner = new Scanner(System.in);
            System.out.println("What is the weather outside?");

            String weather=scanner.nextLine();

            if(weather.equalsIgnoreCase("sunny")) {
                System.out.println("take a walk");

          }  else if (weather.equals("rainy")) {
                    System.out.println("take a nap");

          }  else if (weather.equals("snowing")) {
                System.out.println("build a snowman");
            } else { 
                System.out.println("invalid answer");
            }

          }


}
            
            
            
        

    


	}
			
	