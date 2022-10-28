package com.syntax.Class20;

public class HWMTask3 {


    /*Create 1 class with a static method that has 3 overloaded forms.
    Then call each overloaded method with specific arguments and observe result.*/
    static void print (int AB){
        System.out.println(AB);
    }
    static void print(int aa ,int bb){
        System.out.println(aa+bb);
    }
    static void print(int ac,  double bc){
        System.out.println(ac+bc);
    }
}
class teststatic{
    public static void main(String[] args) {
        HWMTask3 .print(2);
        HWMTask3.print(2,6);
        HWMTask3.print(6,5.4);
    }
}