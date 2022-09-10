package com.problemsDayByDay;

import java.util.Scanner;

public class ProblemOfSquarerootOfNum {
	static int squareValue;
	static int ctr;

	//--------------static block to initialize static variables;
	static {
		squareValue=0;
		ctr=1;
	}

	//-------------------User-defined methods--------------
	static void toSquareNumbers(int userInput) {

		for(;ctr<=userInput/2;ctr++) {
			squareValue=ctr*ctr;
			if(squareValue==userInput) {
				break;
			}
		}
	}

	static void toCheckPerfectSquare(int userInput,int ctr) {
		if(squareValue==userInput) {
			System.out.println("Given number "+userInput+" is a perfect square and it's square root is :-"+ctr);

		}
		else {
			System.out.println("Given number "+userInput+" is not a perfect square ");
		}
	}


	//-----------------------------------constructor---------------
	ProblemOfSquarerootOfNum(){

		Scanner scanObj=new Scanner(System.in);

		System.out.print("Enter Number to know is it a perfect square or not? :- ");
		int userInput = scanObj.nextInt();

		toSquareNumbers(userInput);
		toCheckPerfectSquare(userInput, ctr);

	}

	//-----------------------------Main Method-----------------------
	public static void main(String[] args) {
		new ProblemOfSquarerootOfNum();
	}
}