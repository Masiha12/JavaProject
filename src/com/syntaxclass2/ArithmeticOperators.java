package com.syntaxclass2;

public class ArithmeticOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// +.-,/,%
		int a=900;
		int b=100;
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		
		
	
		
		System.out.println("                  ");
		int e=10;
		int f=5; 
		System.out.println("division="+e/f);//2
		System.out.println("remainder="+e%f);//0
		System.out.println(20/9);
		
		
		System.out.println("               ");
		int c=10;
		int d=3;
		
		int sum=c+d;
		int sub=c-d;
		int remiander=c%d; //10%31
		int div=c/d;//10/3=3
		
		System.out.println("sum is ="+sum);
		System.out.println("sub is ="+sub);
		System.out.println("remiander is="+remiander);//1
		System.out.println("division of integers ="+div);//3
		
		double num1=10.0;
		double num2=3.;
		
		System.out.println("division of double"+num1/num2);
		
		String variable1=("Java");
        String variable2=("programming language");
        String var3=(" is the #1");

        System.out.println(variable1+var3+variable2);

	}

}
