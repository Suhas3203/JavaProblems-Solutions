package com.problemsDayByDay;

import java.util.Scanner;

public class ProblemOnAutomorphicNumber {

	static int noOfDigits=0;
	static int additionNumber= 0;
	//------------------------- Methods -------------------------------------
	static int toChecknoOfDigits(int inputNumber) {		//method for checking no of digits in given number

		while(inputNumber!=0) {
			int reminder= inputNumber % 10;
			inputNumber/=10;
			noOfDigits++;
		}
		return noOfDigits;
	}

	static int toOutputExpressionValue(int inputNumber) {		//method for expresssion of square of input number & number value upto no of digits
		long squareOfNumber =(long) inputNumber*(long)inputNumber;
		System.out.println("Square of Entered Number :- "+squareOfNumber);
		int counter = 0;
		for(;counter < noOfDigits;) {
			int base=10;
			int power=10;
			while(counter < noOfDigits) {
				power=power/base;
				additionNumber +=(squareOfNumber % 10)*power;
				squareOfNumber/=10;
				power*=100;
				counter++;
			}
		}
		return additionNumber;
	}

	static void toCheckAutomorphic(int copyOfNumber) {			//method for checking condition of automorphic number

		if(copyOfNumber==additionNumber) {
			System.out.println(copyOfNumber+" is a Automorphic Number");
		}
		else {
			System.out.println(copyOfNumber+" is Not a Automorphic Number");
		}
	}

	//----------------------------Constructor------------------------------
	ProblemOnAutomorphicNumber(int inputNumber) {
		int copyOfNumber= inputNumber;
		System.out.println("Entered Number :- "+inputNumber);
		//calling methods
		toChecknoOfDigits(inputNumber);		
		toOutputExpressionValue(inputNumber);
		System.out.println("-------------------------------------");
		toCheckAutomorphic(copyOfNumber);
	}

	//------------------------Main Method-----------------------------------
	public static void main(String[] args) {

		Scanner userObj = new Scanner(System.in);

		System.out.print("Enter Number to check is it Automorphic Number :- ");
		int inputNumber= userObj.nextInt();
		//	int copyOfNumber= inputNumber;
		new ProblemOnAutomorphicNumber(inputNumber);		//parametrized constructor calling

		/*
		ProblemOnAutomorphicNumber.toChecknoOfDigits(inputNumber);
		ProblemOnAutomorphicNumber.toOutputExpressionValue(inputNumber);
		ProblemOnAutomorphicNumber.toCheckAutomorphic(copyOfNumber);
		 */

	}

}


