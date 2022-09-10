package com.problemsDayByDay;

import java.util.Scanner;

public class ProblemOnNeonNumber {
	
	void toCheckNeonNumbers(int inputNumber) {
		int ctr=0;
		for(;inputNumber< 1000000000;inputNumber++) {
			//System.out.println("Number Entered :-" + inputNumber);
			int sum=0;
			int squareOfNumber =inputNumber*inputNumber;
			for(;squareOfNumber!=0;) {

				sum += (squareOfNumber%10);
				squareOfNumber/=10;
			}
			
			if(inputNumber==sum) {
				System.out.println(inputNumber + " is a Neon Number");
				ctr++;
			}
			/*
			else {
				System.out.println(inputNumber + "is Not a Neon Number");
			}

			System.out.println("--------------Using ternary operator---------------");
			System.out.println(inputNumber==sum ? inputNumber+" is a Neon Number" :inputNumber+ " is not a Neon Number");
		*/
		}
		System.out.println("Total Neon Numbers :- "+ ctr);
	}

	//-----------------------Constructors --------------------------------

	ProblemOnNeonNumber(int inputNumber) {
		toCheckNeonNumbers(inputNumber);

	}

	//-----------------------main Method -------------------------------------

	public static void main(String[] args) {
		Scanner scanObj = new Scanner(System.in);

		System.out.print("Enter Number you want to check is it Neon Number :- ");
		int inputNumber= scanObj.nextInt();		//accept number from input

		new ProblemOnNeonNumber(inputNumber);		//parameterized constructor calling 



	}

}
