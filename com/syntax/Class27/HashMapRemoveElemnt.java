package com.syntax.Class27;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class HashMapRemoveElemnt {
    public static void main(String[] args) {


        HashMap<String, Double> fruit = new HashMap<>();
        fruit.put("Apple", 1.99);// to store the value in a map
        fruit.put("Mango", 1.99);
        fruit.put("Orange", 4.99);
        fruit.put("Banana", 12.1);// if try to make the Key doplicate
        // the old value will be remove and the new one will be replace
        fruit.put("Banana", 10.1);

    /* Collection<Double>  values=fruit.values();// return all values from a map
        Iterator<Double> iterator=values.iterator();
        while (iterator.hasNext()){
            Double value=iterator.next();
            if(value>2){
                iterator.remove();
            }
        }*/

        fruit.values().removeIf(x->x>2);// same result as code from 18 to 26
        System.out.println(fruit);
    }
}
