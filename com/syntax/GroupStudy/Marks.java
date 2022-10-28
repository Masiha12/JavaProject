package com.syntax.GroupStudy;

public abstract class Marks {



    /*2. We have to calculate the average of marks
    obtained in three subjects by student A and by
    student B. Create class 'Marks' with an abstract
    method 'getPercentage' th  at will be returning
    the average percentage of marks. Provide
    implementation of abstract method in classes
'A' and 'B'. The constructor of student A takes the
    marks in three subjects as its parameters and
    the marks in four subjects as its parameters for
    student B. Test your code*/

    abstract double getPercentage() ;



}

class A extends Marks{
    double subject1;
    double subject2;
    double subject3;
    A(double subject1,double subject2, double subject3){
        this.subject1=subject1;
        this.subject2=subject2;
        this.subject3=subject3;
    }

    @Override
    double getPercentage() {
        return (subject1+subject2+subject3)/3;
    }
}
class B extends Marks{

    double subject1;
    double subject2;
    double subject3;
    double subject4;
    B(double subject1,double subject2, double subject3, double subject4){
        this.subject1=subject1;
        this.subject2=subject2;
        this.subject3=subject3;

        this.subject4=subject4;
    }

    @Override
    double getPercentage() {
        return (subject1+subject2+subject3+subject4)/4;
    }

    public static void main(String[] args) {
        Marks []obj={new A(99,85,75),new B(70,80,90,95) };
        for(Marks grade:obj){
            System.out.println(grade.getPercentage());
        }
    }

}