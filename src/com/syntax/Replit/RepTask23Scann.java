package src.com.syntax.Replit;

import java.util.Scanner;

public class RepTask23Scann {

    /*
Create a program that will ask a user to input boolean value "Input the boolean
value"
If the input is true or false, then the output should look like below:
Example Output:
Input the boolean value
The value is true
Example Output:
Input the boolean value
The value is false
 */

        public static void main(String[] args) {
            Scanner user = new Scanner(System.in);
            System.out.println("Input the boolean value");
            boolean value = user.nextBoolean();
            if (value) {
                System.out.println("The value is " + value);
            } else {
                System.out.println("The value is " + value);
            }
        }
    }

