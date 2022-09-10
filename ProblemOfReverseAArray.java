package com.problemsDayByDay;

import java.util.Scanner;

public class ProblemOfReverseAArray {

	public static void main(String[] args) {
		Scanner userObj= new Scanner(System.in);
		System.out.print("Enter the no of colums in array :- ");
		int colsInArray=userObj.nextInt();

		int numberArray[]=new int[colsInArray];

		for(int ctr=0;ctr<colsInArray;ctr++) {
			System.out.print("Enter value for array index "+ ctr +" :- ");
			numberArray[ctr]=userObj.nextInt();
		}
		System.out.print("Input array is :- ");
		for(int copyOfNumberArray:numberArray) {
			System.out.print(copyOfNumberArray+"  ");
		}

		int number;
		for(int counter=0;counter<colsInArray/2;counter++) {
			number=numberArray[counter];
			numberArray[counter]=numberArray[colsInArray-counter-1];
			numberArray[colsInArray-counter-1]=number;
		}
		System.out.println();
		System.out.print("Reverse array is :- ");
		for(int reverseOfNumberArray:numberArray) {
			System.out.print(reverseOfNumberArray+"  ");
		}

	}

}
