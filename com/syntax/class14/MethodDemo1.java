package com.syntax.class14;

public class MethodDemo1 {
    // method does not take any parameters and prints some lines on the consle
    void printHello(){
        System.out.println("Hello word");
        System.out.println("Hello java");
        System.out.println("hello Aladin");
    }
  // A Method that takes a single parameter of type string and print it
void printWord(String word){
    System.out.println(word);
}
    public static void main(String[] args) {
        MethodDemo1 obj=new MethodDemo1();
        obj.printHello();
        obj.printWord("taivion do not worry it's java");
         obj.printWord("No Athira it does not make sense i am confused can you please reapet");
    }
}
