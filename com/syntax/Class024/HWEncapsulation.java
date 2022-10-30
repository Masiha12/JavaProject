package com.syntax.Class024;

import java.util.ArrayList;

public class HWEncapsulation {
    public static void main(String[] args) {




   /* Create an ArrayList that will store 5 names into it.
    Find out whether the given ArrayList is empty or not?
    Check whether the specific name is present in an ArrayList or not?
    Find the size of your arrayList and print all values from that*/

        ArrayList<String> names = new ArrayList<>();

        names.add("Masiha");
        names.add("Aisha");
        names.add("Sarah");
        names.add("Masouda");
        names.add("Khaterah");
        System.out.println(names);
        if(names.isEmpty()){
            System.out.println("Name can not be empty");
        }else{
            System.out.println("Name is empty.please try again");
        }
        System.out.println(names.contains("Masiha"));
        System.out.println(names.size());
        for (String Name: names) {
            System.out.println(Name);

        }
    }
}