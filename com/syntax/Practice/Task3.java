package com.syntax.Practice;



public class Task3 {




}
class Teacher1 {


  protected  String name;
 protected    int age;
    int yearOfNom;

   Teacher1(String name, int age, int yearOfNom){
       this.name=name;
       this.age=age;
       this.yearOfNom=yearOfNom;
   }

    void teach() {
        System.out.println(name+" is teaching");
    }
}
class Math extends Teacher1{
    int age;
    Math(String name,int age,int yearOfNom){
        super(name,age,yearOfNom);
    }
    void print(){
        System.out.println(25);
    }
}
class Ch extends Teacher1{
    String checking;
    Ch(String name,int age,int yearOfNom){
     super(name, age, yearOfNom);
    }

}
class Paino extends Teacher1{
    String songs;
    Paino(String name,int age,int yearOfNom){
        super(name, age, yearOfNom);
    }
}
class Teaster3{
    public static void main(String[] args) {
        Math math=new Math("Masiha",29,20);
        math.print();
        math.teach();
    }
}