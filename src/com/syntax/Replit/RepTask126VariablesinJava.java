package src.com.syntax.Replit;

public class RepTask126VariablesinJava {
    /*
  Create a variable that will hold the count of all instances of the Main class
  Create 3 Object of the class and print value of the count variable;
  Expected Output:
  3
   */

        static int count;
        public static void main(String[] args) {
            RepTask126VariablesinJava m = new RepTask126VariablesinJava();
            count++;
            RepTask126VariablesinJava x = new RepTask126VariablesinJava();
            count++;
            RepTask126VariablesinJava v = new RepTask126VariablesinJava();
            count++;
            System.out.println(count);
        }
    }


