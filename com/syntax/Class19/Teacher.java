package com.syntax.Class19;

public class Teacher {
//    Write a Java program called Teacher.  Identify features and behaviour of that Class.
//        Create 3 subclasses MathTeacher,
//    ChemistryTeacher and PianoTeacher that would have it their own features and behaviour. Test all 4 classes


    String name;
    String lastName;
    String degree;
    Teacher(String name, String lastName, String degree){
        this .name=name;
        this.lastName=lastName;
        this.degree=degree;
    }
    void Info(){
        System.out.println(name+" "+lastName+" "+degree);
    }
}
class MathTeacher extends Teacher{
    String subject;
    MathTeacher(String name, String lastName, String degree, String subject){
        super(name,lastName,degree);
        this.subject=subject;
    }
    void inFom(){
        System.out.println(name+ " , He is teaching  "+subject);
    }

}

class  ChemistryTeacher extends Teacher{
    int age;
    ChemistryTeacher(String name, String lastName, String degree, int age){
        super(name,lastName,degree);
       this.age=age;
    }
    void Info(){
        System.out.println(" his age is "+age);
    }
}
class PianoTeacher  extends Teacher{
    boolean Isprof;

    PianoTeacher(String name, String lastName, String degree, boolean Isprof){
        super(name,lastName,degree);
        this .Isprof=Isprof;
    }
    void print(){
        System.out.println(" He is professional");
    }
}

class TeacherTester{
    public static void main(String[] args) {
        Teacher tech=new Teacher("Huma","Amiri","BA");
        tech.Info();

    MathTeacher math=new MathTeacher("Khabir","Abdullah","batchler","Csince");
        math.inFom();
       ChemistryTeacher ch=new ChemistryTeacher("Masiha","Abdullah","MS", 25) ;
       ch.Info();
       PianoTeacher pa=new PianoTeacher("Aisha","abdullah","ad",true);
       pa.print();

    }
}