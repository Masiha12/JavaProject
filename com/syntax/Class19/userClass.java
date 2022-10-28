package com.syntax.Class19;



public class userClass {
//
//    Write program: userClass  that has a constructor that initializes instance
//    variable name and mobile number.
//    Create a subclass  userInfo that will have user address variable and it also
//    being initialized through constructor call.
//    Print users name, mobile number and address in userDetails method. Test your code.


String name;
String number;
userClass(String name,String number ){
    this.name=name;
    this.number=number;
}
}
class   userInfo extends userClass{
    String address;
    userInfo(String name, String number,String address){
        super(name,number);
        this.address=address;
    }
    void userDetails(){
        System.out.println("The name is "+name+" his phone number is  "+number+" And he lives in  "+address);
    }}
class Tester1{
    public static void main(String[] args) {
        userInfo user=new userInfo("Alex","0034267891", "5903,EstGrand, Street.");
        user.userDetails();}
}

