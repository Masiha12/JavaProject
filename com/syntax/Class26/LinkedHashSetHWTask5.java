package com.syntax.Class26;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetHWTask5 {
    public static void main(String[] args) {
     //   Create a Set of cities in which you want to make sure that insertion order is maintained.
               // Then remove any city that starts with “A”;


        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        // inserting speed is same as HasSet but retrieval speed is-the worse
        linkedHashSet.add("New York");
        linkedHashSet.add("Virginia");  // Hashset does not print the order
        linkedHashSet.add("California");
        linkedHashSet.add("Taxes");
        linkedHashSet.add("Alexandria");
        linkedHashSet.add("Washington");
        linkedHashSet.add("Alaxsa");

        System.out.println(linkedHashSet);

        Iterator<String> iterator=linkedHashSet.iterator();
        while (iterator.hasNext()){
        String item=iterator.next();
        if (item.startsWith("A")){
           iterator .remove();

        }

    }
        System.out.println(linkedHashSet);

}}