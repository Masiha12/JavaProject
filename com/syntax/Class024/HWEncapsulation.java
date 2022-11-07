package com.syntax.Class024;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;

public class HWEncapsulation {
    public static void main(String[] args) {




   /* Create an ArrayList that will store 5 names into it.
    Find out whether the given ArrayList is empty or not?
    Check whether the specific name is present in an ArrayList or not?
    Find the size of your arrayList and print all values from that*/
 // Angle braket<>
// Non genric way of using collections framework this is how your ancestores use to write code before
// 1.5 it casues a lot of problems at run time because java do not know at compile time what type of data
// You are storing in this class because java not know it can not know help you avoid these error.

        ArrayList<String> names=new ArrayList(5);
        names.add("Saama");
        names.add("Vidaya");
        names.add("Seemeen");
        names.add("Sarah");
        names.add("Aisha");
        System.out.println(names.isEmpty());
        System.out.println(names.contains("Sarah"));
        System.out.println(names.contains("John"));
        System.out.println(names.size());
        System.out.println(names);



        /*ArrayList<String> names = new ArrayList<>();

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
    }*/
    }}