package com.syntax.Class4;

import java.util.Scanner;

public class Recapscaner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);

        System.out.println("Pelease Enter your age");
        int age=scanner.nextInt();

        System.out.println("Pelease Enter your name");
        String name=scanner.nextLine();


        System.out.println(name+" is "+age+" years old");

        /*
         * nextLine is a special method that can capture spaces and enters as well 
         * when we use any method like nextInt() or nextBoolean(), nextDouble() and after that if we use
         * nextLine() we need to discard that enter by using an extra nextLine() call 
         */

        Scanner Scanner=new Scanner(System.in);

        System.out.println("Pelease Enter your age");
        int age1 =scanner.nextInt();

        System.out.println("Pelease Enter your name");
        scanner.nextLine();
        String name1=scanner.nextLine();
        System.out.println(name1+" is "+age1+" years old");


    }
        
        
        
        
        
        
        
    }

	


