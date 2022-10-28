package com.syntax.Class23;

public class Banana extends Fruit {
    String origin;
    Banana(String name,String shape,String color, String origin){
        super(name,shape,color);
        this.origin=origin;
    }
    void makeSmothie(){
        System.out.println("from"+name+" we get tasty smoothie");
    }

    public static void main(String[] args) {
        Banana ban=new Banana("banana" ,"banana shape","yellow","Evcuador");
        ban.grow();
       // ban.haveBenefit();
        ban.makeSmothie();
    }

    }


