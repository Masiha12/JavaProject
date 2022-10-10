package com.syntax.class18;

public class ThisKeywordClass1 {


    String str="Red";
    void print() {
        String str = "Blue";
        System.out.println(this.str);
        System.out.println(str);
    }

    public static void main(String[] args) {
        new ThisKeywordClass1().print();
    }
}
