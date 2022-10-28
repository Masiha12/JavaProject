package com.syntax.Practice;

public class Task3Class19 {

  /*  Create 1 class with a static method that has 3 overloaded forms.
    Then call each overloaded method
    with specific arguments and observe result.*/

    static void print(){
        System.out.println("i do not love java");
    }
    static void print(String str){
        System.out.println("i love "+str);
    }
    static void print(String str,int time){
        for(int i=0; i< time;i++){
            System.out.println("i do not love"+str);
        }

    }

    public static void main(String[] args) {
        print();

    }
}
