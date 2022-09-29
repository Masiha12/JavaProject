package com.syntaxclass3;

public class Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * type casting=>type=data casting=converting
		 * converting one data type to another
		 */
		byte box1=127; // smallest box
		short box2=3333; //slightly large box
		int box3=45454545; // large box most commonly used
		long box4=45454545; // slightly large box
		float box5=414564545; // large box
		double box6=454545445; // largest
		
    int number= (int)15.2; //we can not store a decimal number in a box of type double
    System.out.println(number);
    
    byte smallerbox=(byte)box2;
    System.out.println(smallerbox);
    
    short biggerBox=box1;
    
    long box7=box1;// we can do this because box 7 is larger than box1
    float box8=(float)box6;
    char a=(char)67;
    
    System.out.println(a);
    int box9=(int)box4;
    System.out.println(box9);
    
    
    
	}

}
