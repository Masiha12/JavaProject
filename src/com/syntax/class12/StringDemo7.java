package com.syntax.class12;

import java.util.Arrays;

public class StringDemo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="I love java programming";
// tocharArray will convert to string to an array of chars
char[]charArray=str.toCharArray();
System.out.println(charArray[5]);
System.out.println(Arrays.toString(charArray));
int counter=0;
for(char c:charArray) {
	if(c=='a') {
		counter++;
	}
}
System.out.println("Letter a has appread "+counter+" times");
	}

}
