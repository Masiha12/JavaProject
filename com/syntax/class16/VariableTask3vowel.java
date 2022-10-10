package com.syntax.class16;

public class VariableTask3vowel {





  private static  String getVowels(String str){
String newStr=str.replaceAll("[^aeiouAEIOU]", "");
return newStr;
    }

    public static void main(String[] args) {
        System.out.println(getVowels("Masiha"));
    }
}
