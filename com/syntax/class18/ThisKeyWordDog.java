package com.syntax.class18;

public class ThisKeyWordDog {

    String name;
    String breed;
    String color;
    String age;
    double weight;
    double height;

    public ThisKeyWordDog(String name, String breed, String color, String age, double weight) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.age = age;
        this.weight = weight;
        this.height = height;


    }

    public ThisKeyWordDog(String name, String breed, String color, String age, double weight, double height) {
      /*  this.name = name;
        this.breed = breed;
        this.color = color;
        this.age = age;
        this.weight = weight;

       */

  this (name,breed,color,age,weight);
        this.height = height;
    }

}