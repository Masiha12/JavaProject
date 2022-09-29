package com.syntax.class7;

public class HomeWork4Class7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Print odd numbers between 20 and 50 (2 ways)
		 */
		
    int c=21;
    while(c<=50) {
    	System.out.print(c+ " ");
    	c+=2;
    }
    System.out.println("**************Another way*****");
    
    
    int d=20;
    while(d<=50) {
    	if(d%2==1) {
    		System.out.print(d+ " ");
    	}
    	d++;
    }
    
	}
}
 
	

	 
	
