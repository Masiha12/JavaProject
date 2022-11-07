package com.syntax.Class025;

import java.util.ArrayList;

public class HomeWork1 {
    public static void main(String[] args) {
        //   Create an arrayList of words.
        //   Remove every word that ends with “e”.


        ArrayList<String> word = new ArrayList<>();
        word.add("java");
        word.add("India");
        word.add("Palestine");
        word.add("Usa");
        word.add("France");
        word.add("Ukrain");

        var iterator = word.iterator();// var is a keyword that decide the data type for us

        while (iterator.hasNext()) {
            var words = iterator.next();
            if (words.endsWith("e")) {
                iterator.remove();


            }

        }
        System.out.println(word);

    }}













        /*ArrayList<String> words = new ArrayList<>();
        words.add("expose");
        words.add("quite");
        words.add("hope");
        words.add("Smart");
        words.add("happy");
  //Iterator<String> iterator=new Iterator();

        var iterator = words.iterator();
      while (iterator.hasNext()) {
          var word=iterator.next();
          if(word.endsWith("e")){
              iterator.remove();
          }
      }
        System.out.println(words);
    }*/


