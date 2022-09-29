package com.syntax.class10;

public class Task2dArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Create a 2D array (longer way)where you will store the following values: Mr, Mrs, Ms, Miss and  Smith, Jordan, Jackson, Obama.
		//After storing values print following String:
			//Mrs Smith, Mr Obama, Ms Jackson, Miss Jordan.
		
		String [][]countries= {
				              {"usa", "Canada"},// first array with index0
				              {"Peru", "Brazil", "colombia","Ecuado"},
				              {"Ethiopia", "Egypt", "Kenya"},
				              {"Germany","Turkiye","Moldova", "Ukraine"},
				              {"Kazakhstan", "Afghanistan", "korea"},
		};
		System.out.println(countries.length);
		
	int el0f1arr=(countries[0].length);
	System.out.println("# of elements from 1 array ="+el0f1arr);
	
	
	int el0f2arr=(countries[0].length);
	System.out.println("# of elements from 2 array ="+el0f2arr);
	
	for(int r=0; r<countries.length; r++) {
		for(int c=0; c<countries[r].length; c++) {
			System.out.print(countries[r][c]+" ");
		}
		
		
		
		System.out.println(" ------- getting all values from 2d array using for each loop -----");

        for (String[] country : countries) {

            for (String c : country) {

                if (c.equals("Kazakhstan")) {
                    System.out.println(c+ " is my home country");
                } else {
                    System.out.print(c + "  ");
                }
            }
            System.out.println();
        }

				
	}
	}

}
