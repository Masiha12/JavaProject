package com.sentax.Class21;

public class Animal1 {

    void eat(){
        System.out.println("Animals usually eat plants");
    }
    void sleep(){
        System.out.println("Animals sleep for 8 to 18 hours");
    }
}
class Panda extends Animal{
    void eat(){
        System.out.println("Panda eat Bamboos");
    }
    //@Overriding is an annotation that tells java to check foo extra rules like if we are properly overriding a method or not.
    void sleep(){
        System.out.println("Panda sleep for 14 hours");
    }
}
class Cat extends Animal{
    void eat(){
        System.out.println("Cat likes to eat Fish");
    }
}