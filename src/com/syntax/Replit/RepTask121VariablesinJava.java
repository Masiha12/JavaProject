package src.com.syntax.Replit;

public class RepTask121VariablesinJava {

    /*
declare 3 instance variables to hold an integer, double and char values.
Create 2 instances of the class and assign values to variables and the print them
Expected Output:
10
10.23
a
100
100.23
s
 */

        int number;
        double num;
        char character;
        public static void main(String[] args) {
            RepTask121VariablesinJava  m = new RepTask121VariablesinJava ();
            m.number = 10;
            m.num = 10.23;
            m.character = 'a';
            System.out.println(m.number);
            System.out.println(m.num);
            System.out.println(m.character);
            RepTask121VariablesinJava  x = new RepTask121VariablesinJava ();
            x.number = 100;
            x.num = 100.23;
            x.character = 's';
            System.out.println(x.number);
            System.out.println(x.num);
            System.out.println(x.character);
        }
    }

