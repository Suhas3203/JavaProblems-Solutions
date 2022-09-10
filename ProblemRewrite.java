package com.problemsDayByDay;

import java.util.Scanner;

public class ProblemRewrite {
	public static void main (String args[]) {

		Scanner firstInput= new Scanner(System.in);
		System.out.print("Enter The Number (Between : 1 - 127) :- ");
		byte numValue = firstInput.nextByte();

		System.out.println("......Print Number till entered number.....");

		for(int ctr= 1; ctr <= numValue;ctr++) {
			System.out.println(ctr);

		}

		System.out.println("......................");

		System.out.println("....Even Numbers......");
		for(byte ctr1=1;ctr1<= numValue;ctr1++) {


			if(ctr1 % 2 ==0) {
				System.out.println(ctr1);
			}
		}

		System.out.println("...................");

		System.out.println("....Odd Numbers......");

		for(byte ctr1=1;ctr1<= numValue;ctr1++) {


			if(ctr1 % 2 !=0) {
				System.out.println(ctr1);
			}
		}

		System.out.println("...................");

		System.out.println(".....Even & Odd Numbers at a time.......");

		for(byte ctr1=1;ctr1<= numValue;ctr1++) {


			if(ctr1 % 2 ==0) {
				System.out.println("Even Number :- "+ctr1);
			}
			else {
				System.out.println("Odd Number :- "+ ctr1);
			}
		}



		System.out.println("...................");

		System.out.println(".....Sum Till Number Entered......");

		int sumOfCtr = 0;
		for(byte ctr1=1;ctr1<= numValue;ctr1++) {

			sumOfCtr+=ctr1;
		}
		System.out.println(sumOfCtr);
		System.out.println(numValue*(numValue+1)/2);
	}
}
