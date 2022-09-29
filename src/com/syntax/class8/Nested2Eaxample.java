package com.syntax.class8;

public class Nested2Eaxample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  for(int a=0;a<=9;a++) {
	  for(int b=0;b<=9;b++) {
		  for(int c=0; c<=9; c++) {
			  System.out.println(a+" "+b+" "+c);
	
		  }
	  }
  }
 // Multiplication table
  
  for(int i=1; i<=9; i++) {
	  for(int j=1; j<=9; j++) {
	System.out.println(	  i+" * "+j+" = "+i*j);
	  }
	  //task
	  for(int a=0; a<=23; a++) {
          for(int b=0; b<=59; b++) {
              System.out.println(a+":"+b);
          }
      }
	  
	  
	  for(int h=0; h<=12; h++) {
		  for(int k=0; k<=24; k++) {
		  System.out.println(h+" :"+k);
		  }	  
	  }
  }
	}

}
