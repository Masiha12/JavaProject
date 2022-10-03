package com.syntax.MethodsHW;
// Create a method that will take 2 parameters as a numbers
// and prints which number is larger.



public class MethodsTask1largestno {
    void largest(int number1, int number2){
if(number1>number2){
    System.out.println("the largest number is=" + number1);
}else{
    System.out.println("the largest number is=" + number2);
}



    }
    public static void main(String[]args){
        MethodsTask1largestno num=new MethodsTask1largestno();
        num.largest(25,30);
    }

}
