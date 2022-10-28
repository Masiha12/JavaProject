package com.syntax.Class19;

public class AClass {
//    Write program to inherit class A that has method printF which is static and call or reuse that method into class B

    static void PrintF(){
        System.out.println("Syntax Technology");

    }

}
class BClass extends AClass{


}
class ABTester{
    public static void main(String[] args) {
        BClass obj=new BClass();
        obj.PrintF();

    }
}