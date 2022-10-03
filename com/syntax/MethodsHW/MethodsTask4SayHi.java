package com.syntax.MethodsHW;

public class MethodsTask4SayHi {
    /*Write a method to return whether given number is prime or not?*/
    boolean isPrime(int num){
        boolean isPrime=true;
        if (num > 1) {

            for(int i=2;i<num;i++) {
                if(num%i==0) {
                    isPrime=false;
                    break;
                }
            }
        }else {
            isPrime=false;
        }

        return isPrime;
    }

    public static void main(String[] args) {
        MethodsTask4SayHi obj = new MethodsTask4SayHi();
        System.out.println(obj.isPrime(12));
        System.out.println(obj.isPrime(5));
    }
}


