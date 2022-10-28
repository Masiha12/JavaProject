package src.com.syntax.Replit;

import java.util.Scanner;

public class RepTask32else {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        char gender;
        int age;
        System.out.println("Please enter your gender: M or F");
        gender=scanner.next().charAt(0);
        System.out.println("Please enter your age");
        age=scanner.nextInt();
        String out;
        if(age>25){
            if(gender=='F'){
                out="Woman";
            }else {
                out="Man";
            }
        }else{
            if(gender=='F'){
                out="Girl";
            }else {
                out="Boy";
            }
        }
        System.out.println(out);
    }
}
