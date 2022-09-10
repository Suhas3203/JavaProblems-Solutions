package com.problemsDayByDay;

import java.util.Scanner;

public class ProblemOnCopyArray {

	public static void main(String[] args) {
		Scanner scanObj= new Scanner(System.in);

		System.out.print("Enter number of colums in Matrix :- ");
		int columsOfMatrix=scanObj.nextInt();
		int numberMatrix[]=new int[columsOfMatrix];

		int copyOfMatrix[] =new int [columsOfMatrix];
		int ctr=0;
		for(;ctr<columsOfMatrix;ctr++) {
			System.out.print("Enter Value for "+ ctr + " :- ");
			int indexValue = scanObj.nextInt();
			numberMatrix[ctr]=indexValue;

			copyOfMatrix[ctr]=numberMatrix[ctr];
		}

		System.out.print("Even indexed values :- ");
		for(int ctr2=0;ctr2<columsOfMatrix;ctr2+=2) {

			System.out.print(copyOfMatrix[ctr2] + " ");

		}
		System.out.println();

		System.out.print("Odd indexed values :- ");
		for(int ctr2=1;ctr2<columsOfMatrix;ctr2+=2) {

			System.out.print(copyOfMatrix[ctr2] + " ");

		}
		System.out.println();

		for(int inputArr : numberMatrix) {
			System.out.print(inputArr + " ");

		}

		System.out.print("Copied matrix is :- ");

		for(int copyArr : copyOfMatrix) {
			System.out.print(copyArr + " ");

		}

	}

}
