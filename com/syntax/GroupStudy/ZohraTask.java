package com.syntax.GroupStudy;

public class ZohraTask {

    /*
     Write a program  that creates a class named as Encode that has one method named as EncodeString
     (int offset, String word).
     This function would encode or encrypt the given word, for example
     if words is abc and offset is 2, so we get cdf as string in return
    create one instance array to store alphabets from a to z
    */

}

class Encode {

    String alphabet;

    public Encode(String alphabet){
        this.alphabet=alphabet;
    }

    public String EncodeString(int offset, String word){
        String encodedWord="";
        for (int i=0;i<word.length();i++){
            char c=word.charAt(i);// corrector one by one

            int index=alphabet.indexOf(c);
            index+=offset;
            char newC=alphabet.charAt(index);
            encodedWord+=newC;
        }
        return encodedWord;
    }
    public static void main(String[] args) {
        String alphabet="abcdefghij";
        Encode obj=new Encode(alphabet);
        System.out.println(obj.EncodeString(2,"abc"));
    }
}

