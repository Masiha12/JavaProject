package com.syntax.Class025;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {


        ArrayList<String> makeUpItem = new ArrayList<>();
        makeUpItem.add("Blush");
        makeUpItem.add("Base");
        makeUpItem.add("concealer");
        makeUpItem.add("Mascara");
        makeUpItem.add("eyeLinear");
        makeUpItem.add("Lipstick");

        ArrayList<String> cosmetics=new ArrayList<>();
        cosmetics.add("Dove Soap");
        cosmetics.add("Conditioner");
        cosmetics.add("shapoo");
        cosmetics.add("lotion");


        ArrayList<String> BeautyProducts=new ArrayList<>();
        BeautyProducts.addAll(makeUpItem);
        BeautyProducts.addAll(cosmetics);
        System.out.println(BeautyProducts);
BeautyProducts.remove("lotion");// remove only one item
        System.out.println(BeautyProducts);
        BeautyProducts.removeAll(cosmetics);
        BeautyProducts.clear();//remove everything
        System.out.println(BeautyProducts);
    }
}