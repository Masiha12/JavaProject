package com.syntax.Class26;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TypeOfsets {
    public static void main(String[] args) {
        // There are three type of ste
        //HasSet:Down side is  it does not care about the insertion order
          //Upside it is the fater type of set
        HashSet<String> hashset=new HashSet<>();
        hashset.add("Mango");
        hashset.add("Apple");  // Hashset does not print the order
        hashset.add("Kiwi");
        hashset.add("Orange");
        hashset.add("Banana");
        System.out.println(hashset);

        // Whenver you need insertion order use LinkedHashSet
        LinkedHashSet<String> linkedHashSet=new LinkedHashSet<>();
       // inserting speed is same as HasSet but retrieval speed is-the worse
        linkedHashSet.add("Mango");
        linkedHashSet.add("Apple");  // Hashset does not print the order
        linkedHashSet.add("Kiwi");
        linkedHashSet.add("Orange");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Banana");
        System.out.println("linkedHashSet");
        System.out.println(linkedHashSet);

        TreeSet<String> treeSet=new TreeSet<>();
        // Whenever you need sorted data use TreeSet/
        treeSet.add("Mango");
        treeSet.add("Apple");  // Hashset does not print the order
        treeSet.add("Kiwi");
        treeSet.add("Orange");
        treeSet.add("Banana");
        System.out.println("linkedHashSet");
        System.out.println(treeSet);
    }
}
