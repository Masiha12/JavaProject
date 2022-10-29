package src.com.syntax.Replit;

public class RepTask110JavaMethods {

    /*
Create a method name as newLine that should have print statement inside the method
body as "newLine method implementation"
Create a method name as displayLine that should have print statement inside the
method body as "displayLine method implementation"
Call both methods
Expected Output:
newLine method implementation
displayLine method implementation
 */

        public static void main(String[] args) {
            RepTask110JavaMethods m = new RepTask110JavaMethods ();
            m.newLine();
            m.displayLine();
        }
        void newLine() {
            System.out.println("newLine method implementation");
        }
        void displayLine() {
            System.out.println("displayLine method implementation");
        }
    }

