package com.syntax.class13;

public class StringHomeworkpoligram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String a="";
   char[]b=a.toCharArray();
   String c="";
   for(int i=b.length-1;i>=0;i--) {
   c+=b[i];
	}
	System.out.println(c);
}
}