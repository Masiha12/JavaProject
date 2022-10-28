package com.sentax.Class21;

public class Animal {

    String name;
    String color;
    String bree;


    void sleep(){
        System.out.println("Animla sleep 6 hours");
    }
    void eat(){
        System.out.println("green and meat");
    }
}
class Cat1 extends Animal{
    void sleep(){
        System.out.println("I like to sleep less");
    }
    void eat(){
        System.out.println("I like only fish");
    }

}
class Dog1 extends Animal{
    void sleep(){
        System.out.println("i like sleep more");
    }
    void eat(){
        System.out.println("dog likes meat");
    }
}
class TesterAnimal{
    public static void main(String[] args) {
        Cat1 cat=new Cat1();
        cat.eat();
        Dog1 dog=new Dog1();
        dog.eat();
    }
}