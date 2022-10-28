package com.syntax.Practice;

public class Userclass {


    String name;
    String mobileNumber;

    Userclass(String name,String mobileNumber){
        this.name=name;
        this.mobileNumber=mobileNumber;
    }

}

class Userinfo extends Userclass{
    String address;
    Userinfo(String name,String mobileNumber,String address){
        super(name, mobileNumber);
        this.address=address;
    }

  public   void display(){
        System.out.println(name+" "+mobileNumber+" "+address);
    }

}
class UsTester{
    public static void main(String[] args) {
        Userinfo use  =new Userinfo ("Masiha", "9085605561","Alexandria");
        use.display();
    }
}