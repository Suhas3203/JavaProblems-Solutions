package com.problemsDayByDay;

import java.util.Scanner;

public class ProblemOnReverseANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userObj= new Scanner(System.in);

		System.out.print("Enter Number to reverse it :- ");
		int firstNumber= userObj.nextInt();
		int reminder;
		int reverseNumber=0;
		while(firstNumber > 0) {
			reminder= firstNumber % 10 ;
			reverseNumber=reverseNumber*10+reminder;
			firstNumber/=10;
		}
		System.out.print("This is reverse Number of given Number :- " + reverseNumber);
	}

}
