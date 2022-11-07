package com.syntax.Class025;

import java.util.ArrayList;

public class RemoveAllDemo1 {
    public static void main(String[] args) {
        ArrayList<String> makeUpItem = new ArrayList<>();
        makeUpItem.add("Blush");
        makeUpItem.add("Base");
        makeUpItem.add("concealer");
        makeUpItem.add("Mascara");
        makeUpItem.add("eyeLinear");
        makeUpItem.add("Lipstick");


        ArrayList<String> itemsToberemoved=new ArrayList<>();

        itemsToberemoved.add("Blush");
        itemsToberemoved.add("Base");
        itemsToberemoved.add("concealer");
        itemsToberemoved.add("josh");
        makeUpItem.removeAll(itemsToberemoved);
       // makeUpItem.clear();
        System.out.println(makeUpItem);
    }
}
