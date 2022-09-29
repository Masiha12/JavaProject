package com.syntax.class9;

public class HowmeWork4array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	From an array of integer elements find the largest number.
		int[ ]Arr={200, 400,500};
	int	largest=0;
		for(int number:Arr) {
		if(number>=largest)	{
			largest=number;
		}
		
		}
		System.out.println("the largest number is " +largest);
		}


	}


