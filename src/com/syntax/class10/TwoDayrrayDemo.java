package com.syntax.class10;

public class TwoDayrrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][]arr={
				{10, 20,30, 40},
			       	{100, 200,300,400},
			       	{1,2,3,4}
	};	
		
		System.out.println(arr[0][1]);
		{	
	}
	
	String[][] arr1= {

            {"Yusuf", "Hamza", "Adam", "John"},
	
	            {"A", "B", "C", "D"},
	
	
	};

    for(String[] singleArray:arr1) { //loops over 1d or single array

        for(String el:singleArray) { //loops over each element of the 1dArray
              System.out.print(el+"  ");
        }

        System.out.println();
    }

    System.out.println(" ---------------------------- ");


    for(int i=0; i<arr1.length; i++) {

        for (int j=0; j<arr1[i].length; j++) {
            System.out.print(arr1[i][j]+"  ");
        }
        System.out.println();
    }

}

}

