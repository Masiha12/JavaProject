package com.sentax.Class21;

public class Parent1 {

    void getMarry(){
        System.out.println(" you will marry the girl that we select for you");
    }
}
class zam extends Parent1{
    void getMarry(){

        System.out.println("i want to marray a taylor");
    }
}
class Test{
    public static void main(String[] args) {
        zam zim=new zam();
        zim.getMarry();
    }
}