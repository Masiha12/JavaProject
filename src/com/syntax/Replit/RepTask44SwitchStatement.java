package src.com.syntax.Replit;

import java.util.Scanner;

public class RepTask44SwitchStatement {


        public static void main(String[] args) {
            System.out.println("Please enter your favorite car make");
            Scanner scanner=new Scanner(System.in);
            String carModel=scanner.next();
            String out;
            switch (carModel){
                case "BMW":
                    out="Your favorite car is german car";
                    break;
                case "Toyota":
                    out="Your favorite car is japanese car";
                    break;
                case "Maserati":
                    out="Your favorite car is italian car";
                    break;
                default:
                    out="Your favorite car is unknown";
            }
        }
    }

