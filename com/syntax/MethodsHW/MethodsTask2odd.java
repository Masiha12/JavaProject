package com.syntax.MethodsHW;

import java.util.Scanner;

public class MethodsTask2odd {
    //Create a method that will take a number and
    //prints whether
    //the number is even or odd.
    void oddnumber(int num) {
        if (num % 2 == 0) {
            System.out.println("the number is even");
        } else {

            System.out.println("the number is odd");
        }
    }

    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the number");
        int number =scanner. nextInt();

        MethodsTask2odd obj = new MethodsTask2odd();
        obj.oddnumber(number);
    }
}