package com.syntax.class18;

public class HWStudentClassTask1 {
    /*
    Write a Student class   that have instance variables name and address.
     Create a constructor that will initialize those variables.
     Print name & address of given  student using displayInfo method.

     */
    String name;
    String address;

    public HWStudentClassTask1(String name, String address) {
        this.name = name;
        this.address = address;
    }

    void displayInfo(){
        System.out.print(" Student name is "+name+ " and she live in  "+address);
    }

    public static void main(String[] args) {
        HWStudentClassTask1   Masiha= new HWStudentClassTask1("Aisha","USA,VA.");
        Masiha.displayInfo();
    }

}