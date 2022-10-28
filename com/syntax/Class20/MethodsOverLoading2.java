package com.syntax.Class20;

public class MethodsOverLoading2 {
    //By changing the number of parameter
    void F1(String name, int number) {
        System.out.println(name + " " + number);
    }
     /// by changing the data types
    void F1(String name, int number, int number2) {
        System.out.println(name + " " + number + number2);
    }

    void F1(int num1, int number) {
        System.out.println(num1 + " " + number);
    }

    void F1(int number, String name) {
        System.out.println("int number,String name");
    }

    public static void main(String[] args) {
        MethodsOverLoading2 md=new MethodsOverLoading2() ;
        md.F1("Masiha",20);
    }
}