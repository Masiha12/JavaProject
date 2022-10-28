package com.syntax.Practice;

public class Repl {
    static class Main {
        static final String reverse(String str){
            String newString="";
            for(int i=4; i>=0; i--){
                newString=newString+str.charAt(i);
            }
            return newString;
        }
        public static void main(String[] args) {
            System.out.println(reverse("hello"));
        }}



}




   /* Create a Parent Class that will have two overloaded abstract methods m1

        Make Main class as concrete subclass to Parent Class

        In main method call the methods.
*/
abstract class Parent{
    abstract void m1();
   }
class Main
{
    static void subtract(int num1, int num2, int num3, int num4)
    {
        System.out.println((num1-num2-num3-num4) + " (should come from subtracting 4 numbers)");
    }

    static void subtract(int num1, int num2, int num3)
    {
        System.out.println((num1-num2-num3)  + " (should come from subtracting 3 numbers)");
    }

    static void subtract(int num1, int num2)
    {
        System.out.println((num1-num2) + " (should come from subtracting 2 numbers)");
    }

    public static void main(String[] args)
    {

        subtract(100, 30, 20, 10);
        subtract(100, 20, 50);
        subtract(40, 20);
    }

}

