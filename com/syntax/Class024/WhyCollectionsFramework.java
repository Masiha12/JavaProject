package com.syntax.Class024;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

public class WhyCollectionsFramework {
    public static void main(String[] args) {



    // if we have to store a single value we should use variables
// if
    String name="Josh";
    String name2="joe";
        System.out.println(name);

    // if we have to store more than 2 value of same kind we should go with array

    String[] names={"Rashad", "Adam", "Again josh"};
    // also there is some issue with array, array is fixed in size
 String []breeds=new String[10];
 breeds[0]="Bulldogs";
        System.out.println(Arrays.toString(breeds));// to print the complete content of a array we use arrays.to-string
 ArrayList<String> colors=new ArrayList<>();
 colors.add("Green");
 colors.add("Red");
        System.out.println(colors.contains("Green"));
        System.out.println(colors);

}
}