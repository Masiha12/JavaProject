package com.syntax.class18;

public class Car {
// common class has many different names like parent class super class base class

    String model;
    String make;
    int year;
    String color;
    double engineCC;
    int topSpeed;
    double price;

    // if  a filed or method has private acces modifier
    // in parent class child classes can not uset it;
void printCarDetails(){
    System.out.println("model "+model+" make "+make+" color "+color);
}

}
class BMW extends Car{
    //
   double engineCC;
}
class Toyota extends Car{
    double engineCC;
}
class Tesla extends Car {

}
class CarTester{
    public static void main(String[] args) {
        BMW Bmw=new BMW();
        Bmw.make="BMW";
        Bmw.color="Black";
        Bmw.model="x8";
        Bmw.engineCC=200;
    }


}
