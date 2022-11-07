package com.syntax.Class27;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo2 {
    public static void main(String[] args) {


        LinkedHashMap<String, Double> beautyProduct = new LinkedHashMap<>();
        beautyProduct.put("Foundation",50.5);
        beautyProduct.put("Blush",20.0);
        beautyProduct.put("Lipstick",10.5);

        LinkedHashMap<String, Double> cosmetic =new LinkedHashMap<>();
        cosmetic.put("Soap", 10.2);
        cosmetic.put("conditioner", 20.5);
        cosmetic.put("Shampo", 30.99);

        LinkedHashMap<String,Double> grocery=new LinkedHashMap<>();
        grocery.putAll(beautyProduct);
        System.out.println(grocery);
        grocery.putAll(cosmetic);
        System.out.println(grocery);
        grocery.clear();
        System.out.println(grocery);
}}