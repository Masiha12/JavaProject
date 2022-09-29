package com.syntax.project;

public class ProjectTask11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Write a program to print out duplicate elements from an Array of Strings?

        String[] arr= {"Talha", "Abdullah", "Basak", "Talha", "Basak", "Shah"};

         for(int i = 0; i < arr.length; i++) {
                for(int j = i + 1; j < arr.length; j++) {
                    if(arr[i] == arr[j])  {
                        System.out.println("Duplicate elements are "+arr[j]);
                    }
                }
    }

	}

}
