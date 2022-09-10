package com.problemsDayByDay;

import java.util.Scanner;

public class ProblemForPetersonNumbers {
	static int sum=0;
	//------------------------Method--------------------
	int toSumInitNumber(int initNumber) {
		

		for(;initNumber != 0;) {
			sum+=ProblemOnMultiDArray.toCalculateFactorialOfNum(initNumber % 10);		//expression for addition of value after factorization
			initNumber/=10;
		}
		return sum;
		
	}

	void toCheckPetersonNumber(int tempNumber) {			//checking for peterson numbers condition
		if(tempNumber==sum) {
			System.out.println(tempNumber + " is a Peterson Number");
		}
		else {
			System.out.println(tempNumber + " is Not a Peterson Number");
		}
	}

	//---------------constructor----------------------

	ProblemForPetersonNumbers(int initNumber) {
		
		int tempNumber=initNumber;
		System.out.println("Entered Number :- "+initNumber);
		
		toSumInitNumber(initNumber);
		System.out.println("Value After addition of factorials of digits :- "+sum);
		System.out.println("---------------------------------");
		toCheckPetersonNumber(tempNumber);
	}

	

	public static void main(String[] args) {

		Scanner userObj = new Scanner(System.in);

		System.out.print("Enter Number to check is it Peterson Number or not? :- ");
		int initNumber=userObj.nextInt();
		
		new ProblemForPetersonNumbers(initNumber);

	}

}
