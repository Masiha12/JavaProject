package com.syntax.class12;

public class StringDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String FirstName="Olena";
    String LastName="Du dka";
    
    System.out.println(FirstName + LastName);
  //  Another way
    System.out.println(FirstName.concat (LastName));
    
    
    String Str="";
    //
     //isEmpty() returns true if a String is empty this method will returns false
     //even if you have space in aString variable however the isBlnk method does not count the space
    
    
    
    System.out.println(Str.isEmpty());
    
	}

}
