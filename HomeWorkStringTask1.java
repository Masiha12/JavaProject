import java.sql.SQLOutput;

public class HomeWorkStringTask1 {
    public static void main(String[] args) {

      //  Create a String that should be combination of letters, numbers and special characters.
            //    Find out how many Alphanumeric(abd AZ 284) characters are there in the String.
         String str="dsfkjAska1263##@!";
         str=str.replaceAll("[^a-zA-z0-9]", "");
        System.out.println("str ="+ str);
        System.out.println(str.length());
    }
}
