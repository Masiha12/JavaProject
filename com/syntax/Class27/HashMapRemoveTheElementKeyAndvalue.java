package com.syntax.Class27;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapRemoveTheElementKeyAndvalue {
    public static void main(String[] args) {


        HashMap<
                String, Double> fruit = new HashMap<>();
        fruit.put("Apple", 1.99);// to store the value in a map
        fruit.put("Mango", 2.99);
        fruit.put("Orange", 4.99);
        fruit.put("Banana", 12.1);// if try to make the Key doplicate
        // the old value will be remove and the new one will be replace
        fruit.put("Banana", 10.1);
     /*Set<Map.Entry<String,Double>>  entrySet=fruit.entrySet();
        Iterator<Map.Entry<String,Double>> iterator=*/

    }
}