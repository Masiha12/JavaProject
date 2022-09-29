package com.syntax.class10;

public class TwodArraySmallestNo {

	

	{
		char[][] numbers = null;
		int i = 0;
		System.out.println(numbers[i]); 
	{
		int[][] arr= new int[][] {
            {10,20,30},
            {45,3,98,98}
        };
        int smallest = arr[0][0];
        System.out.println((arr[1]));
        System.out.println(arr[1][2]);

        for(int r=0; r<arr.length; r++) {
            for(int c=0; c<arr[r].length;c++) {
                if(arr[r][c]<smallest) {
                    smallest = arr[r][c];
                }
                System.out.print(arr[r][c]+" ");
            }
            System.out.println( );

        }
        System.out.println(smallest);

    }

	char[]values={'s', 'a', 'y','b' ,'n', 'c', 't', 'd','a', 'e','x', }; 
	   for( int i1=0; i1< values.length; i1+=2){
	     System.out.print( values[i1] );
	   }



	  }




	}
	


