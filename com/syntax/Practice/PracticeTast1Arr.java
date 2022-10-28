package com.syntax.Practice;

public class PracticeTast1Arr {
    public static void main(String[] args) {
        int[][] num = {
                {54, 54, 43},
                {3, 4, 3},
                {43, 3, 43}
        };
        int count=0;
        int store=0;
        for(int i=0;i<num.length;i++){
            for(int j=0;j<num[i].length-2;j++){
                if(num[i][j]==num[i][j+1]){
                    System.out.println("duplicate number: "+num[i][j]);
                    count++;
                }else if(num[i][j]==num[i][j+2]){
                    System.out.println("duplicate number: "+num[i][j]);
                    count++;
                }
            }
        }
        System.out.println("There are "+count+" duplicates.");

    }

}
