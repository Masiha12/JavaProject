package com.syntax.class13;

public class StringHomeWork4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



	   
	   
		//	String Str= "Java class is so  hard!";
		//    System.out.print(Str.replaceAll(" ",""));
	   
	   

	
   
	//Create a String that should be combination of letters, 
	//numbers and special characters. Find out how many Alphanumeric(abd AZ 284)
	//characters are there in the String.
	/*
		String letter= "qoznA2ADF23(*&^%^%^^ER@%$%#^$%&^%^&";
	String result=letter.replaceAll("[^a-zA-Z0-9]", "");
	System.out.println(result);
	System.out.println(result.length());
	
	
	You have a String a=”Is it Saturday? 
	Is it raining? Do we have a Java Class today?”
	 How would you find out how many sentences are in that String?
	*/
	String paragh = "Java class is so fun. We have Java class"
			+ " four days of week. I always get confuse when i "
			+ "do not pay attention in Java lessons.";
	String[] sentence=paragh.split("[.]");
	System.out.println(sentence[2]);
	
	System.out.println("There is " + sentence.length + " sentences");
	
	
}    
	
}