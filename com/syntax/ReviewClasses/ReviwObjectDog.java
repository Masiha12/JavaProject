package com.syntax.ReviewClasses;

public class ReviwObjectDog {
String name;//instance va
int weight;
static String breed;
void printInfo(){
    System.out.println("ReviwObjectDog features:"+name+", "+weight+","+breed);
}
void love(String thing){
    System.out.println(name+"love"+thing);
}

    float getPrice() {
        if (weight < 5) {
            return 100;
        } else if (weight < 10) {
            return 200;
        } else {
            return 1000;
        }

    }
    // create a method that will return bark type
    // if weight is more than 5-->loud
    // if weight is less than 20---->noise is wooh
    //if weight is less 500> noice Gav gav.

    String bark(){

        String noise;
        if(weight<5){
        noise ="loud";
    }else if(weight<10){
        noise="woof woof";
    }else{
        noise="Gav gav";
    }
    return noise;
    }
}
