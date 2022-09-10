package com.problemsDayByDay;

public class ProblemThird {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numberOfSeries = 10;

		if(numberOfSeries > 0) {
			System.out.println("Given Number " + numberOfSeries + " is a Positive Number.");
		}
		else if(numberOfSeries < 0) {
			System.out.println("Given Number " + numberOfSeries + " is a Negative Number.");
		}
		else {
			System.out.println("Given Number " + numberOfSeries + " is Zero.");
		}

		System.out.println("...................................................................");

		int dividendNumber= 30;

		if (dividendNumber % 7 == 0) {	
			if (dividendNumber >0 ) {
				System.out.println("Given Number " + dividendNumber + " is Positive And Divisible by 7.");
			}
			else if(dividendNumber <0 ) {
				System.out.println("Given Number " + dividendNumber + " is Negative And Divisible by 7.");
			}
			else {
				System.out.println("Given Number " + dividendNumber + " is Zero.");
			}
		}
		else {
			if(dividendNumber > 0 ) {
				System.out.println("Given Number " + dividendNumber + " is Positive And Not Divisible by 7.");
			}
			else if(dividendNumber < 0) {
				System.out.println("Given Number " + dividendNumber + " is Negative And Not Divisible by 7.");
			}
		}
		
		System.out.println("...................................................................");
		
		int numberInSeries = 0;
		
		if(numberInSeries % 2 ==0 && numberInSeries > 0) {
			System.out.println("Given Number "+ numberInSeries + " is a Even Number.");
		}
		else if(numberInSeries % 2 !=0) {
			System.out.println("Given Number "+ numberInSeries + " is a Odd Number.");
		}
		else {
			System.out.println("Given Number "+ numberInSeries + " is Zero.");
		}
	}

}
