package com.syntax.Class27;

import java.util.HashMap;
import java.util.Set;

public class HashMapIterator {
    public static void main(String[] args) {
        HashMap<
                String, Double> fruit=new HashMap<>();
        fruit.put("Apple", 1.99);// to store the value in a map
        fruit.put("Mango", 2.99);
        fruit.put("Orange", 4.99);
        fruit.put("Banana", 12.1);// if try to make the Key doplicate
                                  // the old value will be remove and the new one will be replace
        fruit.put("Banana", 10.1);
        System.out.println(fruit);

        Set<String> keySet=fruit.keySet();// return all keys in the form of set
        System.out.println(keySet);
        var value=fruit.values();// return all the value in the form of collection value
        System.out.println(value);


    }
}
