package com.syntax.Practice;

public class Task1Class19 {
    /*Create 1 class in which create a methods that will cc the area (volume in case of box) of
      Rectangle, Square, Box
      Use separate class to test your code
     */
    public static void main(String[] args) {
        AreaManager mana=new AreaManager() ;
        mana.calcaulate(10);
    }

}
class AreaManager{
    void calcaulate(double len, double wid){
        System.out.println(len*wid);
    }
    void calcaulate(double len){
        System.out.println(len*len);
    }

    void calcaulatevolume(double len,double height,double wid){
        System.out.println(len*wid+height);
    }
}

