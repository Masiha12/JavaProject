package com.syntax.class17;

public class ConstHorse {


    String name;
String breed;
    int age;
    double weight;
    public ConstHorse(String name, String breed, int age, double weigth){
     this.   name=name;
   this.     breed=breed;
   this  .   age=age;
     this.   weight=weight;
    }
    void printInfo(){
        String name="now this will be printed";
        System.out.println ("name "+name+" breed "+breed+" age "+age+" weight "+ weight);


    }

    public static void main(String[] args) {
        ConstHorse horse=new ConstHorse("Spit","Stallion",20,400);
        horse.printInfo();
    }



}
