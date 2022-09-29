package com.syntax.class9;

public class HomeWork2Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 //2. Create an array of animals and store 5 elements into it.
		//Using 2 different loops print all elements from the array.
		String[] animals=new String[5];
		animals[0]="dog";
		animals[1]="cat";
		animals[2]="monkey";
		animals[3]="sheep";
		animals[4]="horse";
		System.out.println(animals[4]);
		
		{
	}
// Another way;
		
	String []animal= {"dog", "cat", "monkey", "sheep", "horse"};
	
	for(int i=0; i<animal.length; i++) {
		
		System.out.print(animal[i]+" ");
	}
}
}
