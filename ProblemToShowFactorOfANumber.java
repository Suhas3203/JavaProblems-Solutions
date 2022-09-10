package com.problemsDayByDay;

import java.util.Scanner;

public class ProblemToShowFactorOfANumber {

	public static void main(String[] args) {

		Scanner userObj=new Scanner(System.in);
		System.out.print("Enter number to check its factors :- ");
		int userNumber= userObj.nextInt();

		int ctr=1;
		System.out.print("Factors of given number "+userNumber+" are :- ");
		while(ctr<=userNumber) {
			if(userNumber % ctr ==0) {
				System.out.print(ctr+",");

			}
			ctr++;
		}		
	}

}
