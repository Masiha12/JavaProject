package com.syntax.Class20;

public class Overloading2 {

    /*Create a class named 'Programming'.
     While creating an object of the class, if nothing is passed to it, then the message "I love programming languages" should be printed.
     If some String is passed to it, then in place of "programming languages" the value com.syntaxclass2.variable should be printed. Example, if we pass "Java", then "I love Java" should be printed.
            Create 1 class with a static method that has 3 overloaded forms. Then call each overloaded method with specific arguments and observe result.
            Create 1 class with a private method that has 3 overloaded forms. Then call each overloaded method with specific arguments and observe result.

    */
    public static class Programming {

        public Programming() {
            System.out.println("I love to speak different types of languages ");
        }
        public Programming(String word) {
            System.out.println("I do not lave  " + word);
        }
        public static void main(String[] args) {
            Programming obj = new Programming();
            Programming obj1 = new Programming("Java");
        }
    }
}



