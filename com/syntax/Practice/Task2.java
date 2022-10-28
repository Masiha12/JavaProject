package com.syntax.Practice;

public class Task2 {


    public static void main(String[] args) {
        Z.printF();
        W.printF();
    }

}
class Z{

   static void printF(){
       System.out.println("F");
    }

}
class W extends Z{

}
