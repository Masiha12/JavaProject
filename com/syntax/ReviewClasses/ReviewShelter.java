package com.syntax.ReviewClasses;

public class ReviewShelter {
    public static void main(String[] args) {
        ReviwObjectDog dog=new ReviwObjectDog() ;
        ReviwObjectDog.breed="Huskey";
        dog.name="Bobby";
        dog.weight=5;
        dog.printInfo();
        ReviwObjectDog dog2=new ReviwObjectDog();
        System.out.println(dog2.name);
        dog2.name="Tommy";
        dog2.weight=10;
        dog2.printInfo();
        dog.name="Bobik";
        dog.breed="german";
        dog.printInfo();
        dog2.printInfo();
        double price=dog.getPrice();
        System.out.println(price);
       float price2=dog2.getPrice();
        System.out.println(price2);
        System.out.println(dog.bark());
        System.out.println(dog2.bark());
        String  str="hello";
        str.length();
        str.substring(Integer.parseInt("3"));
        dog.love("to jump");
        dog2.love("to play");
    }

}
