package com.syntaxclass3;

public class IfElse2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double money=5;
		boolean isHngry=true;
		double kfcBurger=11;
		
		if(money>kfcBurger) {
			System.out.println("yayy i can enjoy a burger");
		
		}
		else
		{
			System.out.println("I should make something at home");
			
			if(false) {
				System.out.println("if block");
			}else {
				System.out.println("else is block");
			}
		}
	}
		

}
