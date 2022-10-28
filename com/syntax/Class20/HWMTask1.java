package com.syntax.Class20;

public class HWMTask1 {

//    Create 1 class in which create a methods that will calculate the area (volume in case of box) of
//            Rectangle
//    Square
//            Box
//
//    Use separate class to test your code



}
class area{
    void Area(double length, int height){
        System.out.println(length*height);

    }
    void Area(int length){
        System.out.println(length*length);
    }
    void Area (int length,int width,int height){

    }
    public static void main(String[] args) {

        area orr=new area();
        orr.Area(6);
        orr.Area(4,12);
        orr.Area(3,5,10);
    }
}
