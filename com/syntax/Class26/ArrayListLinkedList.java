package com.syntax.Class26;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListLinkedList {

    public static void main(String[] args) {
        //ArrayList faster to get data
      //  LinkedList faster to add/remove data
        LinkedList<String> linkedlist=new LinkedList<>();
       long startTime    = System.currentTimeMillis();
        for(int i=0;i<1000000;i++){
            linkedlist.add("Test");
        }
        long endTime=System.currentTimeMillis();
        System.out.println("LinkedList"+(endTime-startTime));

        ArrayList<String> Arraylist=new ArrayList<>();
        long startTimeA    = System.currentTimeMillis();
        for(int i=0;i<1000000;i++){
            Arraylist.add("Test");
        }
        long endTimeA=System.currentTimeMillis();
        System.out.println("ArrayList"+(endTimeA-startTimeA));

    }


}
