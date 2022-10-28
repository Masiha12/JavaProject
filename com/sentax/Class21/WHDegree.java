package com.sentax.Class21;

import org.w3c.dom.ls.LSOutput;

public class WHDegree {

   /* Create a class 'Degree' having a method 'getPrerequisite'
    that prints ""To get a degree you need high school diploma"".
    Class 'Degree' has 2 subclasses namely 'Bachelors' and Masters’.
    In Masters class override method 'getPrerequisite'.
    Call the method by creating an object of each of the three classes.
*/
   public static void main(String[] args) {
       Degree de=new Degree();
       de.getPrerequisite();
       Bachelors bach=new Bachelors();
       bach.getPrerequisite();
       Masters ms=new Masters();
       ms.getPrerequisite();
   }

 }
 class Degree{
    void  getPrerequisite(){
        System.out.println("To get a degree you need high school diploma");
    }
 }
 class Bachelors extends Degree{

 }
 class Masters extends Degree{

     void  getPrerequisite(){
         System.out.println("To get a  Muster degree you need Bachelor degree.");
     }

 }

