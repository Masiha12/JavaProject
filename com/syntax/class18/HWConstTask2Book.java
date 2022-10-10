package com.syntax.class18;

public class HWConstTask2Book {
    /*
    Write Book class that will have instance variables and 2 Constructors.
     While creating an object make sure:
Instance variables are being initialized
Both Constructors are being executed
     */

    String name;
    int year;
    double price;

    public HWConstTask2Book(String name, int year) {// When we write the costructor,we shukd start with public and then class name;
        this.name = name;
        this.year = year;
        System.out.println(" The book name is "+name+" and it was published in "+ year);
        }
public HWConstTask2Book(double price){
        this.price=price;
    System.out.println("And the book's price is $"+price);
}



    public static void main(String[] args) {
        HWConstTask2Book book=new HWConstTask2Book("Rammona",1884);
        HWConstTask2Book book2=new HWConstTask2Book(12.99);
    }





    }


