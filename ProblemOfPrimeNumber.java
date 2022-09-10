package com.problemsDayByDay;

import java.util.Scanner;

public class ProblemOfPrimeNumber {
	static int inputNumber;
	void toShowPrimeNum(int inputNumber){		//method overriding 
		this.inputNumber=inputNumber;
		boolean flagValue=true;
		int ctr=2;
		while(ctr<inputNumber) {
			if(inputNumber % ctr ==0) {
				System.out.println("Given Number "+inputNumber+" is not a Prime Number");
				flagValue=false;
				break;
			}
			ctr++;
		}								//        
		if(flagValue==true) {
			System.out.println("Given Number "+inputNumber+" is a Prime Number");

		}
	}
}

class PrimeNumbersWithRange extends ProblemOfPrimeNumber{
	static int noOfPrimeNums=0;
	static int inputNumber;


	void toShowPrimeNum(int inputNumber){			////method overriding

		for(int counter=inputNumber;counter<1000;) {
			boolean flag=true;
			int ctr2=2;
			while(ctr2<counter) {
				if(counter % ctr2 ==0) {

					flag=false;
					break;
				}
				ctr2++;
			}								
			if(flag==true) {
				System.out.println(counter);
				noOfPrimeNums++;
			}
			counter++;
			ctr2=2;
		}
	}

	PrimeNumbersWithRange(){

		Scanner scObj=new Scanner(System.in);
		System.out.print("Enter Number to check is it a Prime Number or not :- ");
		int inputNumber=scObj.nextInt();

		super.toShowPrimeNum(inputNumber);
		System.out.println("----------------------------------------------");
		scObj.nextLine();
		System.out.print("Do you want to see how many Prime Numbers are there from "+inputNumber+" till 1000 :- ");
		String acceptConditionChar=scObj.nextLine();
		if(acceptConditionChar.charAt(0)=='y'|acceptConditionChar.charAt(0)=='Y') {
			System.out.println("----------- Prime Numbers ------------------");
			toShowPrimeNum(inputNumber);

		}
	}
	public static void main(String[] args) {

		ProblemOfPrimeNumber objOfPrimeNum=new PrimeNumbersWithRange();

		System.out.println("Total Prime Numbers between input number "+ProblemOfPrimeNumber.inputNumber+" to 1000 are :- "+noOfPrimeNums);
	}
}





