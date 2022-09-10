package com.problemsDayByDay;

import java.util.Scanner;

public class ProblemOnTechNumber {
	int squareOfSum;

	int toCalculateTechNumber(int inputNumber) {
		int quotient = inputNumber/100;
		int reminder = inputNumber%100;

		int sumOfSplittedNum= quotient + reminder;

		squareOfSum = sumOfSplittedNum * sumOfSplittedNum;
		return squareOfSum;
	}
	void toCheckTechNumber(int inputNumber) {
		if(squareOfSum==inputNumber) {
			System.out.println("Given Number "+ inputNumber + " is a Tech Number");
		}
		else {
			System.out.println("Given Number "+ inputNumber + " is not a Tech Number");
		}
	}

	ProblemOnTechNumber(){
		Scanner scanObj=new Scanner(System.in);

		System.out.print("Enter number to check is it Tech Number :- ");
		int inputNumber= scanObj.nextInt();
		toCalculateTechNumber(inputNumber);
		toCheckTechNumber(inputNumber);
	}


	public static void main(String[] args) {

		new ProblemOnTechNumber();

	}

}
