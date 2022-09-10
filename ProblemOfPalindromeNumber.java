package com.problemsDayByDay;

import java.util.Scanner;

public class ProblemOfPalindromeNumber {


	static int reverseNumber= 0;
	static int inputNumber= 0;
	static int ctr=0;
	//----------------------Methods------------------------------------------
	int toReverseNumber(int firstNumber) {				//user defined method for palindrome number
		int reminder;
		inputNumber=firstNumber;

		while(firstNumber > 0) {
			reminder= firstNumber % 10 ;

			reverseNumber=reverseNumber*10+reminder;

			firstNumber/=10;
		}
		return reverseNumber;

	}

	void toCheckPalindrome(int firstNumber) {

		if(inputNumber == reverseNumber) {					//condition for comparing input Number and output number
			System.out.println(inputNumber+" is a Palindrome Number");

		}
		else {
			System.out.println(inputNumber+" is not a Palindrome Number");
		}
	}

	void toCheckPalindromeNumber(int firstNumber) {

		if(inputNumber == reverseNumber) {					//condition for comparing input Number and output number
			System.out.println(inputNumber);
			ctr++;
		}
	}

	//--------------Constructors-------------------------------------------
	ProblemOfPalindromeNumber(int firstNumber) {					// argument type constructor

		this.toReverseNumber(firstNumber);

		this.toCheckPalindrome(firstNumber);

	}
	ProblemOfPalindromeNumber() {
		reverseNumber = 0;
		this.toReverseNumber(inputNumber);

		this.toCheckPalindromeNumber(inputNumber);
	}

	//-------------Main Method ----------------------------------------------

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner numberObj=new Scanner(System.in);		//Scanner Object

		System.out.print("Enter initial number from that how many Palindrome Numbers till 1000000000 :- ");
		int  firstNumber= numberObj.nextInt();								//Accepting number for checking
		int copyOfNumber=firstNumber;

		System.out.println("----------------Checking Palindrome of given Number----------------");
		new ProblemOfPalindromeNumber(firstNumber);			//constructor called by new method---> ProblemOfPalindromeNumber(int)

		inputNumber= firstNumber;
		System.out.println("----------------Checking Palindrome From GivenNumber to till 1000000000-------------------");
		System.out.println("Palindrome Numbers :- ");
		for(;inputNumber < 1000000000;) {

			new ProblemOfPalindromeNumber();

			inputNumber++;
		}
		System.out.println("Total Palindrome Numbers from " + copyOfNumber + " to till 1000000000 are :-" + ctr);

	}

}
