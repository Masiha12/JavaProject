package com.syntax.Class025;

import java.util.ArrayList;

public class HWArrayListTask1 {
    public static void main(String[] args) {


        //Create an arrayList of even numbers from 1 to 500.
        // Remove any number that is divisible
        //by 5 from that arrayList.*/

        ArrayList<Integer> number = new ArrayList<>();
        for(int i=2;i<=500;i=i+2){
            number.add(i);
        }
        System.out.println(number);

        var iterator=number.iterator();
while (iterator.hasNext()){
    Integer num= iterator.next();
    if(num%5==0){
        iterator.remove();
    }
}
        System.out.println(number);
    }
}
