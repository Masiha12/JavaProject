import java.sql.SQLOutput;

public class StringPalindrome {
    public static void main(String[] args) {
        //palindrome
        String str = "abc";
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.reverse();
        if (stringBuilder.toString().equals(str)) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }}
