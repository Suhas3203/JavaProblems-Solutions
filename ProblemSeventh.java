package com.problemsDayByDay;

import java.util.Scanner;

public class ProblemSeventh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner givenNumber = new Scanner(System.in);
		System.out.print("Enter Last Number: ");
		int number = givenNumber.nextInt();
		
		for(int firstValue=1; firstValue <= number; firstValue++ ) {
			System.out.println(firstValue);
		}
		
		System.out.println(".........................................");
		
		for(int firstNum=2 ;firstNum %2 ==0 & firstNum<= 14;firstNum+=2) {
			System.out.println(firstNum);
		}
		
		System.out.println(".........................................");
		
		for(int oddNums=1 ; oddNums %2 ==1 & oddNums <=14; oddNums+=2) {
			System.out.println(oddNums);
		}
	}

}
