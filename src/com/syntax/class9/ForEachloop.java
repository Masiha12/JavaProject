package com.syntax.class9;

public class ForEachloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String[] iceCream= {"vanilla","chocolate","pistashio","kulfi","mango"};
		for(String flavor:iceCream) {
			System.out.print(flavor+" ");
		}
		System.out.println("--------");
		char[]letters= {'A','B','C','D'};
		for(char letter:letters) {
			System.out.print(letter+" ");
			System.out.println("-------");
			int[] numbers= {12, 56,345, 1, 0,9};
			for(int i=0; i<numbers.length; i++) {
				System.out.print(numbers[i]+" ");
				for(int num:numbers) {
					System.out.print(num+" ");
				}
			}
		}
	}

}
