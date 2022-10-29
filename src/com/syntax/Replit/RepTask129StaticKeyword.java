package src.com.syntax.Replit;

public class RepTask129StaticKeyword {

    /*
Declare two static variables to hold
country name
continent
Create a method to display the value of static variables in the following format:
____ located on ____ continent
In the main method assign values to a static variable and execute method display
Expected Output:
Morocco located on Africa continent
 */

        static String countryName;
        static String continent;
        void display() {
            System.out.println(countryName + " located on " + continent + " continent");
        }
        public static void main(String[] args) {
            countryName = "Morocco";
            continent = "Africa";
            RepTask129StaticKeyword m = new RepTask129StaticKeyword();
            m.display();
        }
    }

