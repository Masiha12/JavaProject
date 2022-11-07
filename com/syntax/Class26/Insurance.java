package com.syntax.Class26;

import java.util.ArrayList;

public abstract class Insurance {
    String insuranceNam;
  Insurance(String insuranceNam){
      this.insuranceNam=insuranceNam;
  }
    abstract void getQuote();

    abstract void cancelInsurance();
}
class Car extends Insurance{
String carModel;
    Car(String insuranceNam) {
        super(insuranceNam);// calls the parent class constructor
        this.carModel=carModel;

    }

    @Override
    void getQuote() {
        System.out.println(insuranceNam+"charge 3% of the car value for car"+carModel);
    }

    @Override
    void cancelInsurance() {
        System.out.println(insuranceNam+"has been cancelled");
    }
}
class Pet extends Insurance{
String petType;
    Pet(String insuranceNam, String petType) {
        super(insuranceNam);
        this.petType=petType;
    }

    @Override
    void getQuote() {
        System.out.println(insuranceNam+"charges 150000sd for "+ petType);
    }

    @Override
    void cancelInsurance() {
        System.out.println(insuranceNam+" has been canseled for "+petType);
    }
}
class Health extends Insurance{

    Health(String insuranceNam) {
        super(insuranceNam);
    }

    @Override
    void getQuote() {
        System.out.println(insuranceNam+" charges 2000usd for health");
    }

    @Override
    void cancelInsurance() {
        System.out.println(insuranceNam+" has been canseled");
    }
}
class testerInsurance{
    public static void main(String[] args) {
        ArrayList<Insurance> insurance=new ArrayList<>();
        insurance.add(new Car("adam"));
        insurance.add(new Pet("Geico", "Dog"));
        insurance.add(new Health("State life"));
        System.out.println(insurance);
        for (Insurance i:insurance){
            i.getQuote();
            i.cancelInsurance();
        }
    }
}