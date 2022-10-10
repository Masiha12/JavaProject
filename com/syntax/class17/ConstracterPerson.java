package com.syntax.class17;

public class ConstracterPerson {

    String name;
    String color;
    String country;
    int age;
    double weight;
    String haireColor;
    double height;
    char gender;
 public   ConstracterPerson(){

 }
  public  ConstracterPerson (String person){

    }
    public ConstracterPerson(String color, String country, int age, double weight, String haireColor, double height, char gender) {
        this.color = color;
        this.country = country;
        this.age = age;
        this.weight = weight;
        this.haireColor = haireColor;
        this.height = height;
        this.gender = gender;
    }

    public static void main(String[] args) {
        ConstracterPerson person=new ConstracterPerson();
        ConstracterPerson person2=new ConstracterPerson();
    }
}


