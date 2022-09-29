package com.syntax.class5;

public class Switchdemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		// matching cases must of same data types as a variable
        //no duplicate cases in switch

        char choice='Y';
        String answer;
        
        
        switch (choice) {

        case 'Y':
            answer="Yes";
            break;
        case 'N':
            answer="No";
            break;
        case 'M':
            answer="Maybe";
        break;
        default:
            answer="Unknown";
            break;

        }
        System.out.println(answer);

        //Limitation of the switch case:
        //switch case can not use logical operators
        //switch case can not use relational operators
        // Switch case can not work with boolean values
       // CE: Can not use with float long double;
		
		System.out.println("------------");
		
		
		
		
		
		
		
		
		
	}

}
