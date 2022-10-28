package com.syntax.Practice;

public abstract class Demoabs {


    abstract void display(double result);
    abstract double sum(double a ,double b );
}
class sample extends Demoabs {
    void display(double result){
        System.out.println("result " +result);
    }
    double sum(double a, double b){
        return a+b;
    }

    public static void main(String[] args) {
        sample obj=new sample();

        double num=obj.sum(100,100);
        obj.display(num);
    }
}