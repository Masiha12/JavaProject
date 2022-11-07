package com.syntax.Class025;

import java.util.ArrayList;

public class Iterator {

    public static void main(String[] args) {

        ArrayList<String> beautyProducts = new ArrayList<>();
        beautyProducts.add("Blush");
        beautyProducts.add("Base");

        beautyProducts.add("Mascara");

        beautyProducts.add("lipstick");
        beautyProducts.add("Dove Soap");
        beautyProducts.add("Conditioner");
        beautyProducts.add("Primer");
        beautyProducts.add("shampoo");
        beautyProducts.add("lotion");
        beautyProducts.add("concealer");
        beautyProducts.add("eyeLinear");
//
       /* for (int I = 0; I < beautyProducts.size(); I++) {
            if(beautyProducts.get(I).endsWith("r")){
                beautyProducts.remove(I);
            }
        }*/ // we can not use for loop with iterator
    }}