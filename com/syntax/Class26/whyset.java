package com.syntax.Class26;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class whyset {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(10);
        numbers.add(10);
        System.out.println(numbers);

       LinkedHashSet <Integer> setNumbers=new LinkedHashSet<>();
        setNumbers.add(10);
        setNumbers.add(20);// set is another frame instructor which does not allow duplicate data
        setNumbers.add(10);
    }

}
