package com.syntax.class5;

import java.util.Scanner;

public class Task1Class5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp=new Scanner(System.in);
        System.out.println("Please enter your height");
        double height=inp.nextDouble();

        if(height<60)
        {
            System.out.println("Short");
        }
        else if (height>60 && height<72)
        {
            System.out.println("Medium");
        }
        else if (height>72)
        {
            System.out.println("Tall");
        }
    }






	}


