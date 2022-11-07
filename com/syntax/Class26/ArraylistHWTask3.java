package com.syntax.Class26;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class ArraylistHWTask3 {


    //How can you remove all duplicates from ArrayList?

    public static void main(String[] args) {


        List<String> aList=new ArrayList<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");
        System.out.println(new LinkedHashSet<>(aList));// we convert the list to linkedHashSet To remove the duplicate

    }
}
