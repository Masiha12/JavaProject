package com.syntax.class9;

public class TaskArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Create an array of chars and store grades into it: A,B,C,D,E,F. Then print a grade B (use 2 different ways of creating an array).

		char []grade=new char[6];
		grade[0]='A';
		grade[1]='B';
		grade[2]='C';
		grade[3]='D';
		grade[4]='E';
		grade[5]='F';
		System.out.println("grade[5]");
		
		
		//another way
		char[]grade1= {'A','B','C','D','E','F'};
		System.out.println(grade1[2]);

		
	}
	

}

