package com.syntax.Practice;

public class GrandFather {

    String GirName="Anna";
    void getMarry(){
        System.out.println("get marrid with"+GirName);
    }
}
class Father extends GrandFather{

    String name="sarah";
    void getMarry(){
        System.out.println("get marrid with"+name);
        }}
class son extends Father{

    void getMarry(){
        System.out.println("I will marry with whom i live");
    }
}
class tester{
    public static void main(String[] args) {
        son s =new son();
        s.getMarry();


}

    }
