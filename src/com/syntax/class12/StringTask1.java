package com.syntax.class12;

import java.util.Scanner;

public class StringTask1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//  tore username, password and confirm password 
		//from a user and check following requirements

		
		String userName="User1";
		String password="pass123";
		String confirmPassword="pass123";
		if(userName.isEmpty()&&password.isEmpty()) {
			System.out.println("Username and password cannot be empty");
		}else if (password.length()<8) {
			System.out.println("password is too short");
		}else if(password.contains(userName)) {
			System.out.println("password canot contain username");
		}else if(password.equals(confirmPassword)) {
			System.out.println("passwords do not match");
		}else {
			System.out.println("Your username and password has been created");
		}
	}

}
