package com.syntax.class17;

import java.lang.reflect.Constructor;

public class HomeWork3Const {

    /*
    Write a java class that have 4 constructors with
     4 different access levels of constructors(private,public,default,protected)
     and create 4 objects of this class: 1 - inside same class; 2 -
     from outside the class; 3 - from different class inside different package  and observe result.

     */

    private String fname;
    private String lname;
    private int age;
    private double height;
    private double weight;
    private boolean isEducated;


    private HomeWork3Const(String pfname, String plname){
        fname = pfname;
        lname = plname;
    }
    public HomeWork3Const(int page){

        age = page;
    }
    HomeWork3Const(double pheight, double pweight, boolean pisEducated){
        height = pheight;
        weight = pweight;
        isEducated=pisEducated;
    }
    protected HomeWork3Const(){

    }
    private void info(){
        System.out.println(fname+" "+lname);
    }
    void printInfo(){
        if(isEducated){
            System.out.println("Height: "+height+", Weight: "+weight);
        }else{
            System.out.println("No Info!!");
        }
    }
    public String ageInfo(){
        if(age<=19 && age>=13){
            return "You  become Teenager.";
        }else{
            return "You are not Teenager.";
        }
    }

    public static void main(String[] args) {

        HomeWork3Const person = new HomeWork3Const("joe","biden");
        person.info();
    }

    }


