package com.syntax.ReviewClasses;

 final class Drink {
     String str;



void drink (){
    // final methods canot be overriden
            System.out.println("drinking methods");
        }
     protected final   void enjoy(){
            System.out.println("we enjoy drinking water");
        }

    }


//public class Juice extends Drink{
//protected final   void enjoy(){
//    System.out.println("we enjoy drinking water");
//}
    // the type juse canot subclass the final class Drink
//
//}
