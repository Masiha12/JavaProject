package com.syntax.ReviewClasses;

public class ReviewTeacherClass {
   String name ,lastname;
int experience;
String subject;
double salary;
static String school;
/*
 how to create a constructor
 name of the constructtor should be the same as a class name;
 constructor does not have return type not even void

 when we do not create a constructor
 compiler create a default constructor
 */
  // using below constructor we initialize instance variable(name and last name
   ReviewTeacherClass(String FName,String LName){
       name = FName;
     String  lastName = LName;

   }
   // when you create a constructor
   void print(){
      System.out.println(name+" "+lastname);
   }
}

