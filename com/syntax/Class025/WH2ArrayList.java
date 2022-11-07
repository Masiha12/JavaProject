package com.syntax.Class025;

import java.util.ArrayList;
import java.util.LinkedList;

public class WH2ArrayList {
    public static void main(String[] args) {

        ArrayList<String> drinks=new ArrayList<>();

        drinks.add("Tea");
        drinks.add("coffee");
        drinks.add("Apple juice");
        drinks.add("milk");
        drinks.add("souda");
        for (int i=0;i<drinks.size();i++){
            if(drinks.get(i).contains("a")||drinks.get(i).contains("e")){
              drinks.set(i,"water")  ;
            }
        }
        System.out.println(drinks);
   /* Create an arrayList of drinks.
    If any drink has letter “a” or “e” replace it with water.*/







        /*ArrayList<String> drinks = new ArrayList<>();
        drinks.add("Tea");
        drinks.add("coffee");
        drinks.add("Apple juice");
        drinks.add("milk");
        drinks.add("souda");

var iterator=drinks.iterator();
int count=0;
while (iterator.hasNext()){
    String juice=iterator.next();
    if(juice.contains("a") || juice.contains("e")){
    drinks.set(count,"Tea");
    }
    count++;
}
        System.out.println(drinks);
    }
}
class Hw{
    public static void main(String[] args) {
        ArrayList<Integer> obj=new ArrayList<>();
        for (int i=50;i<=100;i++){
            if(i%2==0){
      obj.add(i);
            }
        }
        var iterator=obj.iterator();
        while (iterator.hasNext()){
          var item=iterator.next();
            if(item%3!=0){
              iterator.remove();
            }
        }
        System.out.println(obj);
       // LinkedList<Integer> obj1=new LinkedList<>();
    }
}
class num25{
    public static void main(String[] args) {
        ArrayList<String> obj=new ArrayList<>();
    }
}*/
    }}