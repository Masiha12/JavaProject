package com.syntax.class17;

public class ReviewConstCat {



    private String name;
    private String breed;
    private   int age;
    private double weight;

    public ReviewConstCat(String catName,String catBreed
    ){
        name=catName;
        breed=catBreed;

    }
    public ReviewConstCat(String catName,String catBreed,
               int catAge,double catWeight){
        name=catName;
        breed=catBreed;
        age=catAge;
        weight=catWeight;
    }
    public void printInfo(){
        System.out.println("Name "+name+ " Breed "+breed+
                " age "+age+" Weight "+weight);
    }

}







