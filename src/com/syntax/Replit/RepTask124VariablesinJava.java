package src.com.syntax.Replit;

public class RepTask124VariablesinJava {

    /*
Declare static variable in class level as below and assign its value:
String ss="Welcome To Syntax Technologies"
Access variable in the main method and print it using three ways you learned so far
Hint:
first way: By calling directly
Second way: By using the className
Third way: By creating the object of the class
Expected Output:
Welcome To Syntax Technologies
Welcome To Syntax Technologies
Welcome To Syntax Technologies
 */

        static String ss = "Welcome To Syntax Technologies";
        public static void main(String[] args) {
            // first way
            System.out.println(ss);
            // second way
            System.out.println(RepTask124VariablesinJava.ss);
            // third way
            RepTask124VariablesinJava m = new RepTask124VariablesinJava();
            System.out.println(m.ss);
        }
    }

