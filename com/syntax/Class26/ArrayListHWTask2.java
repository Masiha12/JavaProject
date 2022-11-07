package com.syntax.Class26;

import java.util.LinkedList;

public class ArrayListHWTask2 {
    /*Create a Card class that will have implemented  and unimplemented methods
            and a constructor that will initializes credit card type.
    Create 3 subclasses of a Card card. Create 3
    objects of different card and store them into LinkedList.
        Using for loop/advanced for loop/ iterator access all methods of the class.*/

}
class Card{
    String intrestrate;
    String cardType;

    Card(String intrestrate, String cardType ){
        this.intrestrate=intrestrate;
        this.cardType=cardType;

    }

    @Override
    public String toString() {
        return "Card{" +
                "intrestrate='" + intrestrate + '\'' +
                ", cardType='" + cardType + '\'' +
                '}';
    }
}
class test{
    public static void main(String[] args) {
        LinkedList<Card> cards =new LinkedList<>();
      //  cards.add(new Card(""
    }
}