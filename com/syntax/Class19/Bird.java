package com.syntax.Class19;

public class Bird {


        Bird (String name, String color, int age, double weight){
            this.name=name;
            this.age =age;
            this.color=color;
            this .weight=weight;
        }





String name;
String color;
int age;
 double weight;

 void PrintInfo(){
     System.out.println("Name "+name+" color "+color+" age "+age+" weight "+weight);
 }


}

class Parrot extends Bird{
    Parrot (String name, String color, int age, double weight){
        super(name,color,age,weight);
        /*this.name=name;
        this.age =age;
        this.color=color;
        this .weight=weight;*/
    }


        }
class Crow extends Bird{

    Crow (String name, String color, int age, double weight){
      super(name,color,age,weight);
       /* this.name=name;
        this.age =age;
        this.color=color;
        this .weight=weight;*/
    }

}

        class Test{
            public static void main(String[] args) {
   Parrot parrot=new Parrot("Zeki","Green",2,1);
   parrot.PrintInfo();

                Parrot crow=new Parrot("Crow","Black",3,1.3);
                crow.PrintInfo();
            }
        }