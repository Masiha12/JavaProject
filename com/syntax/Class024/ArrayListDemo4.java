package com.syntax.Class024;

import java.util.ArrayList;

public class ArrayListDemo4 {
    public static void main(String[] args) {
        ArrayList<String> names =new ArrayList<>();
        names.add("Tymur");
        names.add("Salma");
        names.add("Mj");
        names.add("Josh");
        names.add(0,"Joshn Again");
        System.out.println(names);

        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(25);
        numbers.add(35);
        numbers.add(1,100);
        numbers.set(0,1200);
        System.out.println(numbers);
        numbers.clear();// deletes all the elements from the list
        System.out.println(numbers);

    }
}
