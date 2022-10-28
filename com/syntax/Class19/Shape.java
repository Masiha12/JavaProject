package com.syntax.Class19;


import java.awt.*;

public class Shape {



//    class has a constructor that takes the radius and has a subclass as  circle class.
//    In circle class create a method to calculate the area of circle. Test your code

    static double pi=3.14;
    double radius;
Shape(double radius){
    this.radius=radius;
}
}
class Circle extends Shape{
    Circle(double radius){
        super(radius);
    }
    void Calculate(){
        System.out.println("The redius area of circle is "+(pi*radius*radius));
    }
}
class Tester2{
    public static void main(String[] args) {
        Circle sc=new Circle(12.2);
        sc.Calculate();
    }
}

