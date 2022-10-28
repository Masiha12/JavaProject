package com.syntax.Practice;

public class HWClass22 {

    /*Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
    Define common behavior within parent class and override some methods in child classes
            Define some methods specific to child classes
            Write example of achieving run time polymorphism*/

    public static void main(String[] args) {
        /*Student str =new SyntaxStudent();*/
        Student [] str1={ new SyntaxStudent(),new CollegeStudent(),new SchoolStudent()};
        for (int i = 0; i < str1.length; i++) {
            Student student = str1[i];
            student.info();
            student.Study();

        }
    }
}
class Student{
    void info(){
        System.out.println("I am a student at Syntax ");
    }
    void Study(){
        System.out.println("I study four to 5 hour every day ");
    }
}
class SyntaxStudent extends Student{
    void info(){
        super.info();
        System.out.println("I am a University student");
    }
    void Study(){
        System.out.println("I need to study more than five hours");
    }

}
class CollegeStudent extends Student{
    void info(){
        System.out.println("I am a college student ");
    }

}
class SchoolStudent extends Student{
    void info(){

        System.out.println("I am a school student");
    }

    void Study(){


        System.out.println("I study at Union County College");
    }
}
//Teacher Methods
class Students1{
    void studyhard(){
        System.out.println("Student must study");
    }
    void doHomework(){
        System.out.println("Student must solve the rep");
    }
    void doPractice(){
        System.out.println("students must practice to get good marks");
    }
}
class SyntaxStudent1 extends Students1{
    @Override
    void doHomework(){
        System.out.println("Syntax students must solve all the three time");
    }
    void doPractice(){
        System.out.println("Syntax student must do their own research");
    }

}
class Collegestudent1 extends Students1{
    void doPractice(){
        System.out.println("College student must practice to get good mark");
    }
}
class SchoolStudent1 extends Students1{

}

class studentTester{
    public static void main(String[] args) {
        Students1 []arr={new Collegestudent1(),new SchoolStudent1(),new SchoolStudent1()};
        for(Students1 str:arr){
            str.studyhard();
            str.doHomework();
            str.doPractice();
        }
    }
}