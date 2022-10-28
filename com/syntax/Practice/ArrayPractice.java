package com.syntax.Practice;

public class ArrayPractice {
    //public static void main(String[] args) {
        // sum of 2dArray
        //odd and even

       /* int [][] number={
                {2,6,4},
                {767,86,43},
                {4,7,8}
        };
        int sum=0;
        for(int i=0;i<number.length;i++){
            sum=0;
            for(int j=0;j<number[i].length;j++){
                sum+=number[i][j];
            }
            System.out.println(sum);
        }
    }*/


    static int sumRow(int[][] number) {
        int sum = 0;
        int sum1=0;
        for (int i = 0; i < number.length; i++) {
            // sum=0;
            for (int j = 0; j < number[i].length; j++) {//i=0; j=1
                sum += number[i][j];//sum=0+2=2
            }
            sum1=sum;
        }
        return sum1;
    }
    public static void main(String[] args) {
        int[][] numbers = {
                {2, 6, 4},//12
                {767, 86, 43},//896
                {4, 7, 8}//19
        };
        System.out.println(sumRow(numbers));


    }
}