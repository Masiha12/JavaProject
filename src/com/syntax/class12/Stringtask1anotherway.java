package com.syntax.class12;

import java.util.Scanner;

public class Stringtask1anotherway {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 //store username, password and confirm password from a user and check following requirements
        // * Username and password cannot be empty, if so-> message="Username and password cannot be empty".
        // * Password should be minimun 8 characters, if less-> message="Password is too short".
        // * Password cannot contain username if so, -> message="Password cannot contain username".
        // * Password should match confirmed password, if not -> message="message="Passwords do not match".
        // * Only after all requirements met-> message "Your username and password has been created"
         
         
         

        String userName="user1";
        String password1="pass123";
        String confirmPassword="pass123";

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter the userName");
        userName=scanner.next();
        System.out.println("Please Enter the password");
        password1=scanner.next();
        System.out.println("Please Enter the password Again");
        confirmPassword=scanner.next();
		
		
		
	}

}
