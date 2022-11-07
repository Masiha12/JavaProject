package com.syntax.Class025;

import java.util.ArrayList;

public class ArrayListDemo4 {
    public static void main(String[] args) {


      //  ArrayList<String> beautyProducts = new ArrayList<>();
       // beautyProducts.add("Blush");
      //  beautyProducts.add("Base");

      //  beautyProducts.add("Mascara");

        //beautyProducts.add("lipstick");
        //beautyProducts.add("Dove Soap");

   /*var iterator    = beautyProducts.iterator();
   var item=iterator.next();
   if(item.startsWith("B")||item.endsWith("a")){
       iterator.remove();
       System.out.println(beautyProducts);
   }*/
       // beautyProducts.removeIf(item->item.startsWith("B")||item.endsWith("k"));
      //  System.out.println(beautyProducts);
    }

}
class WH{
    public static void main(String[] args) {


        ArrayList<String> words = new ArrayList<>();
        words.add("expose");
        words.add("quite");
        words.add("hope");
        words.add("Smart");
        words.add("happy");
        //Iterator<String> iterator=new Iterator();

        var iterator = words.iterator();

        while (iterator.hasNext()) {
            var word = iterator.next();
            if (word.endsWith("e")) {
                iterator.remove();

            }


        }
        System.out.println(words);

    }}
