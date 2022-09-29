package com.syntaxStudyGroup;

import java.util.Scanner;

public class HomeWrkClass6part1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Using scanner class create calculator. Allow user to enter 2 numbers and operator(+,-,*,/). Based on operator provide the result to user.
		//Please complete this assignment in 2 ways: using if statement and switch case.

		
		Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter the first number ");
        int num1=scanner.nextInt();
        System.out.println("Please enter the second number");
        int num2=scanner.nextInt();
        System.out.println("Please choose the operation");
        char operation=scanner.next().charAt(0);
        int sum=num1+num2;
        int difference=num1-num2;
        int product=num1*num2;
        int quotient=num1/num2;

		if (operation == '+') {
			System.out.println(sum);
		} else if (operation == '-') {
			System.out.println(difference);
		} else if (operation == '*') {
			System.out.println(product);
		} else if (operation == '/') {
			System.out.println(quotient);
		} else {
			System.out.println("Wrong operation");
			
			
			System.out.println("--------");
			
			int result=0;
		
			switch(operation) {
			case'+':
				result=(num1+num2);
				break;
			case '-':
			result=(num1-num2);
			break;
			case'*':
				result=(num1*num2);
				break;
			case'/':
				result=(num1/num2);
				break;
				default:
					result=(0);
					break;
			}
			System.out.println("The result is" + result);
		}
		System.out.println("---------");
		
		
		 Scanner aaa = new Scanner(System.in);
	        System.out.println("Enter 1st Number");
	        double num3 = aaa.nextInt();

	        System.out.println("Enter 2nd Number");
	        double num = aaa.nextInt();

	        System.out.println("Enter the operator");
	        String oper = aaa.nextLine();
	        char op = aaa.next().charAt(0);

	        double result = 0;
	        boolean wrongOperator=false;

	        if (op == '+') {
	            result = num1 + num2;
	        } else if (op == '-') {
	            result = num1 - num2;
	        } else if (op == '*') {
	            result = num1 *num2;
	        } else if (op == '/') {
	            result = num1 / num2;
	        } else {
	            System.out.println("Enter valid operator");
	            wrongOperator=true;
	        }

	        if (!wrongOperator) {
	            System.out.println(result);
	        }
	    }
	

	}


