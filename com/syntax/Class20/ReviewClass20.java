package com.syntax.Class20;

public class ReviewClass20 {


   public String name, lastname;
   protected String subject;
   int exprience;
   private double salary;

    static String school;
// this -- use to refer to the current object intstance variables instance methods
    ReviewClass20(String name, String lastname){
      this.  name=name;
       this. lastname=lastname;

    }
    ReviewClass20(String name, String lastname, String subject){
this (name ,lastname);
this.subject=subject;
    }
    ReviewClass20(String name,String lastname, int exprience){
       this(name,lastname) ;
       this.exprience=exprience;
    }
    //static only works in static
    // instance member of the class can work with instance and static memeber
 static void work(){
        System.out.println("All teacher work at "+school);
    }
 protected void print(){
        System.out.println("The name is "+name+" "+lastname);
    }
    void tech(){
   this.print();
        System.out.println(name+" teaches "+subject);
    }
    // methods calculate bomus based on expreince and return it
 private double getbonus(){
        if(exprience<5){
            return 3;
        }else {
            return 3.5;
        }
    }
}
class school{

    public static void main(String[] args) {
        ReviewClass20 te=new ReviewClass20("John","Smith");
        System.out.println(te.name);
        ReviewClass20 tec=new ReviewClass20("jane","Smith" ,"Biology");
        tec.tech();
        ReviewClass20 tech=new ReviewClass20("Jack","Smith",5);
        tech.school="Syntax";
        tech.work();
    }

}