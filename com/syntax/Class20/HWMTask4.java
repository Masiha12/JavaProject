package com.syntax.Class20;

public class HWMTask4 {


   /* Create 1 class with a private method that has 3 overloaded forms.
    Then call each overloaded method with specific arguments and observe result.
}*/

    private void display(String name) {
        System.out.println(name);
    }private void display(String lastName,int id) {
        System.out.println(lastName+ " "+id);
    }
    private void display(int age) {
        System.out.println(age);
    }
    public static void main(String[] args) {
        HWMTask4 ob = new HWMTask4();
        ob.display("Masiha");
        ob.display("Abdullah",1820);
        ob.display(25);
    }
}