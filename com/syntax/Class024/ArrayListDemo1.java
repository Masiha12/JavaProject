package com.syntax.Class024;

import java.util.ArrayList;

public class ArrayListDemo1 {

    public static void main(String[] args) {

        // Syntax to create an arrayList
      ArrayList<String>  colors=new ArrayList<>();

      // use add methods to insert elements in an arraylist
      colors.add("Red");
      colors.add("Green");
      colors.add("Blue");
      colors.add("Yellow");
      colors.add("Black");
     // Print all elements
        System.out.println(colors);
        // getting all elements through normal loop
        System.out.println(colors.get(0));
        System.out.println(colors.get(2));
        // size mee
        System.out.println(colors.size());
        for (int i = 0; i <colors.size() ; i++) {
            colors.get(i);
        }
        for(String color:colors){
            System.out.println(color);
        }

    }}