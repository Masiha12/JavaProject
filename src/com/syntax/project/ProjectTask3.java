package com.syntax.project;

public class ProjectTask3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create a 2D array of integer values. Print the sum of
		//all numbers.
		int Sum =0;
		int [][] numbers= {{1,5,4,7,8},{7,8,4,7,9},{12, 4,5,8,7}};
		for(int i=0; i<numbers.length;i++) {
			for (int j=0; j<numbers[i].length;j++) {
				Sum+=numbers[i][j];
	
			}
		}
		
		System.out.println("the total number is ="+Sum);
		//System.out.println("the total sum of the number is ="+Sum);
		

	}
	
}





