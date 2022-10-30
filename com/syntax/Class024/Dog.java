package com.syntax.Class024;

public class Dog {

  private   String name;
   private String bread;
   private int age;
  private   double weight;
 public    Dog(String  name, String bread, int age, double weight){

setName(name);
setBread(bread);
setAge(age);
setWeight(weight);
    }
    void setName(String name){
        if(name.length()>30){
            System.out.println("Name can not be more than 30 letters. please try again");
        } else if (name. isEmpty()) {
            System.out.println("Name can not be empty please try again");
        }else{
            this.name=name;
        }
    }
    void setWeight(double weight){
     if(weight<0){
         System.out.println("Negative weight is not allowed . please try again");
     } else if (weight>30) {
         System.out.println("Please try less than 300 it looks more of a element ");
     }else {
         this.weight=weight;
     }
    }
    void setAge(int age){
     if(age>20){
         System.out.println("Please use less age something seems wrong here, are you sure it is a dog ");
     } else if (age<0) {
         System.out.println("age can not be negative");
     }else {
         this.age=age;
     }
    }
    void setBread(String bread){
        if(bread.length()>20){
            System.out.println("Bread can not be more than 20 letter. please try again");
        } else if (bread.isEmpty()) {
            System.out.println("Bread can not be empty. try again");
        }else {
            this.bread=bread;
        }
    }
    String getName(){
     return name;
    }
    String getBread(){
     return bread;
    }
    int getAge(){
     return age;
    }
    double getWeight(){
     return weight;
    }
    void printInfo(){
        System.out.println("Name "+name+" bread "+bread+" age "+age+" weight "+weight);
    }
}
class test{
    public static void main(String[] args) {
        Dog tommy=new Dog("Tommy","German",10,20);
        System.out.println(tommy.getName());
        tommy.printInfo();
       // tommy.age=1500; we use encapsulation to not allow to bring change here by using private

      //  getter methods use if we want to others can access our code.
        // setter methods we can use if we want to restic  set some rules and condition in your instance varietals .
    }
}