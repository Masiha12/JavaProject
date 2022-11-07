package com.syntax.Class26;

import java.util.ArrayList;

public class HashSetHWTask1 {

    public static void main(String[] args) {
        /*Create a class Insurance that will have an attribute as insuranceName
                and unimplemented behaviour as getQuote and cancelInsurance.
        Create 3 subclasses Car, Pet, Health. Car class has it’s own attribute as carModel
        and Class Pet has petType attribute. Create 3 objects of the sub classes and
        store them in ArrayList. Using for loop/advanced for loop/ iterator access all methods of the class.

        Create a Card class that will have implemented  and unimplemented methods and a
                constructor that will initializes credit card type.  Create 3 subclasses of a Card card.
                Create 3 objects of different card and store them into LinkedList.
                Using for loop/advanced for loop/ iterator access all methods of the class.
*/

    }
}

/*
 abstract class Insurance{
    String insuranceName;
    Insurance(String insuranceName){
        this.insuranceName=insuranceName;
    }

    abstract void getQuote();
    abstract   void  cancelInsurance();
}
class Car extends Insurance {

    String carModel;

    Car(String insuranceName, String carModel) {
        super(insuranceName);
        this.carModel = carModel;
    }

    @Override
    void getQuote() {
        System.out.println("this is the car insurance " + insuranceName);
    }

    @Override
    void cancelInsurance() {
        System.out.println("and the carMode " + carModel);
    }
}
class Pet extends Insurance {
    String petType;

     Pet(String insuranceName,String petType) {
        super(insuranceName);
        this.petType = petType;
    }

    @Override
    void getQuote() {
        System.out.println("This is pet " + insuranceName);
    }

    @Override
    void cancelInsurance() {
        System.out.println("petType " + insuranceName);
    }}

    class Health extends Insurance {
     String insurance;

         Health(String insuranceName) {
            super(insuranceName);
            this.insurance=insurance;
        }

        @Override
      public   void getQuote() {
            System.out.println("name of insurance "+insuranceName);
        }

        @Override
      public   void cancelInsurance() {
            System.out.println("cancel method"+insuranceName);
        }
    }



class test{
    public static void main(String[] args) {

        Car car=new Car("carInsurance", "BMW");
      Pet pe =new Pet("petinsurance","cat");
      Health he=new Health("Healthinsurance");
        ArrayList<Insurance> obj=new ArrayList<>();
obj.add(car);
obj.add(pe);
obj.add(he);

        for(Insurance ob:obj){
            ob.cancelInsurance();
            ob.getQuote();
        }

    }
}
*/
