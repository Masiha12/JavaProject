package com.syntax.class17;

public class HWCostTask3 {
    /*
    Write a java class that have 4 constructors with 4 different access levels of constructors(private,public,default,protected) and create 4 objects of this class: 1 - inside same class; 2 - from outside the class; 3 - from different class inside different package  and observe result.
     */


   private HWCostTask3(){
       System.out.println("Private");
   }
    HWCostTask3(String name){
        System.out.println("default");
    }
protected    HWCostTask3(int ahe){
        System.out.println("protected");
    }
    public  HWCostTask3(boolean isTrue){
        System.out.println("public");
    }

    public static void main(String[] args) {
        new  HWCostTask3();
        new  HWCostTask3("Thank you lubna");
        new  HWCostTask3(10);
        new  HWCostTask3(true);
    }

}
