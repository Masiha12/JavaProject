package com.syntax.Class19;

public class GrandFather {
//Write program for multilevel inheritance where class C inherits from class B and Class B inherits from Class A.
    int money;
    void money(){
        System.out.println("I rewarded this moner from my grandfather! $" +money);
    }
}
class Father extends GrandFather{
}
class Son extends Father{
}
class Tester{
    public static void main(String[] args) {

        Son obj=new Son();
        obj.money=5000;
        obj.money();
    }
}