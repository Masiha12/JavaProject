package com.syntax.Class27;

import java.util.HashMap;

public class HashMapDemo1 {
    public static void main(String[] args) {
        HashMap<
                String, Double> fruit=new HashMap<>();
        fruit.put("Apple", 1.99);// to store the value in a map
        fruit.put("Mango", 2.99);
        fruit.put("Orange", 4.99);
        fruit.put("Banana", 10.1);
        System.out.println(fruit);
        System.out.println(fruit.get("Orange"));
        fruit.remove("Mango");
        System.out.println(fruit);


        System.out.println(fruit.containsKey("Kiwi"));// tell us if a key is present inside the map
        System.out.println(fruit.containsValue(4.99));// search map for this value
        System.out.println(fruit.isEmpty());
        fruit.replace("Apple",2.99);
        System.out.println(fruit);

        // collectin framework store only one , but in HashMap we can store 2. thats why its not work with collection framework
    }
}
