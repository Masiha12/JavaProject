package com.syntax.Class26;

import java.util.Set;
import java.util.TreeSet;

public class HashSetHWTask4 {
    public static void main(String[] args) {


/*
    Create a Set collection in which you need to add names of the countries.
    In this set we want all objects to be sorted in alphabetical order.
        Using 2 different ways retrieve all elements from set.*/

        TreeSet<String> countries = new TreeSet<>();
        countries.add("India");
        countries.add("Pakistan");
        countries.add("Afghanistan");
        countries.add("Soriya");
        countries.add("Banglahdish");
        countries.add("Uzbkistan");
        countries.add("Canada");
        countries.add("Ukrayin");

        System.out.println(countries);
    }
}