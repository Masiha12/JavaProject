package com.syntax.class11;

public class Student {
String name;
String id;
int age;
double weight;
char gender;
void study() {
	System.out.println("student is studying");
	
}
void deleteMessage(){
	System.out.println("Deleting message from discord");
}
void eat() {
	System.out.println("Eating pizzzzzza");
}
public static void main(String[] args) {
	// new student ()=> create the object of student class
	Student friadoonobject=new Student();
	friadoonobject.name="Friadoon";
	friadoonobject.id="123";
	friadoonobject.age=22;
	System.out.println(friadoonobject.name);
	System.out.println(friadoonobject.age);
	friadoonobject.deleteMessage();
	System.out.println("****************");
	
	Student student2=new Student();
	student2.name="Asma";
	student2.age=16;
	student2.weight=30;
	student2.gender='F';
	
	System.out.println(student2.name);
	student2.eat();
}
}
