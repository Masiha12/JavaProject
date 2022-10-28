package com.syntax.Class23;

public class Apple extends Fruit {
    String size;
    String test;
    double price;

    Apple(String name, String shape, String color, String size) {

        super(name, shape, color);
        this.size = size;
    }

    Apple(String name, String shape, String color, String size, String test, double price) {
        this(name, shape, color, size);
        this.test = test;
        this.price = price;


    }
// overloading -methods with same name within same class
    // how to achieve overloading
    //change of parameters
    //type of parameters
    void makeJuice(){
        System.out.println("from "+name+" we can make "+test+"juice");
    }
    void makeJuice(String fruit){
        System.out.println("we have juice from"+name+"mixed with"+fruit);
    }








    public static void main(String[] args) {


        Apple app = new Apple("apple", "circle", "red", "big");
        System.out.println(app.name);
        System.out.println(app.shape);
        System.out.println(Fruit.fresh);
        System.out.println(Apple.fresh);
        app.grow();//super
       // app.haveBenefit();//fruit
        app.makeJuice();//Apple
        // Apple .color not visible since it access modifier is PRIVATE!
    }

}