package com.syntax.class9;

public class HomeWork1Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Create an array of cars 
		//and store 6 elements into it.
		//Using 2 different loops print all values from the array.
		String[]cars=new String[6];

		cars[0]="Toyota";
		cars[1]="BMW";
		cars[2]="Tesla";
		cars[3]="RangeRover";
		cars[4]="MercedesBenz";
		cars[5]="Lexus";
		System.out.println(cars[5]);	
		{	
	}//Different way;
	
	String[] cars1={"Toyota", "BMW","Tesla","RangeRover","MercedesBenz","Lexus"};
	for(String Type:cars1) {
		System.out.print(Type+" ");
	
	}

}
}