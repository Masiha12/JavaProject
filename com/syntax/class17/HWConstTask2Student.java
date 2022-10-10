package com.syntax.class17;

public class HWConstTask2Student {


    /*
    Write a java Class Students that have a constructor which takes
     students name and 3 subject grades.
    Inside your class also have a method to Calculate Average Grade.
     Test Student class for 5 different students with different marks.
      Your program should print an average mark of each students name.
NOTE: please use different names for instance and local variables.
     */
    String name;
    double subj1;
    double subj2;
    double subj3;


    HWConstTask2Student(String studentName, double sub1, double sub2,double sub3){
        name=studentName;
        subj1=subj1;
       subj2=subj2;
        subj3=subj3;

    }
    void calculatePrintAvgGrade(){
        System.out.println(name+" "+(subj1+subj2+subj3)/3);

    }

    public static void main(String[] args) {
        new HWConstTask2Student("Sabah",99,98,97.5).calculatePrintAvgGrade();
    }
}
