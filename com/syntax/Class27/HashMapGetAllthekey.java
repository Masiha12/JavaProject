package com.syntax.Class27;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapGetAllthekey {
    public static void main(String[] args) {


        HashMap<
                String, Double> fruit = new HashMap<>();
        fruit.put("Apple", 1.99);// to store the value in a map
        fruit.put("Mango", 2.99);
        fruit.put("Orange", 4.99);
        fruit.put("Banana", 12.1);// if try to make the Key doplicate
        // the old value will be remove and the new one will be replace
        fruit.put("Banana", 10.1);

        Set<String> allkeys=fruit.keySet();// getting all the keys in the form of a set
        System.out.println(allkeys);
        Iterator<String> iterator=allkeys.iterator();
        while (iterator.hasNext()){
            var item=iterator.next();
            if(item.contains("n")){
                iterator.remove();
            }
        }
        System.out.println(fruit);
    }
}