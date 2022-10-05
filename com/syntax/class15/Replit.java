package com.syntax.class15;

public class Replit {
    String letter(String s,String c){
        return s.replaceAll(c,"*");
    }
    public static void main(String[] args){
        Replit obj= new Replit();
        System.out.println(obj.letter("computer science","e"));
    }
}


