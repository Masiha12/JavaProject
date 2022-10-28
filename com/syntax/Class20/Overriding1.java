package com.syntax.Class20;

public class Overriding1 {


    public int calculateArea(int side)
    {
        return side * 2;
    }


    public int calculateArea(int length, int height)
    {
        return length * height;
    }


    public int calculateArea(int length, int width, int height)
    {
        return length * height * width;
    }
}


class Main
{
    public static void main(String[] YARRRRRRRGGGGSSSSSPIRATES)
    {
        Overriding1 square = new Overriding1();
        System.out.println(square.calculateArea(5));
        System.out.println(square.calculateArea(5, 6));
        System.out.println(square.calculateArea(5, 6, 7));

    }
}



