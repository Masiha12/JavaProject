package com.syntax.class16;

import com.sun.source.tree.EnhancedForLoopTree;

public class VariableTask1Arrayprarameter {


  /*  Create a method that will accept an array as parameters
  and will return a sum of all elements from that array.
   Method should be visibly only within same package
   and accessible by the creating an instance of the class.
   */


    static int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        VariableTask1Arrayprarameter ob = new VariableTask1Arrayprarameter();
        int[] arry = {30, 50, 80, 100};

        System.out.println(sum(arry));
    }
//EnhancedForLoop
    int sumArray(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }



}
