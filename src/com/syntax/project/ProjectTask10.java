package com.syntax.project;

public class ProjectTask10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Write a java program to find the second largest number in the array?

        int temp;

          int array[] = {10, 20, 25, 63, 96, 57, 25, 112};

          for(int i = 0; i<array.length; i++ ){
             for(int j = i+1; j<array.length; j++){

                if(array[i]>array[j]){
                   temp = array[i];
                   array[i] = array[j];
                   array[j] = temp;
                }
             }
          }
          System.out.println("Second largest number is:: "+array[array.length-2]);
	}

}
