package com.problemsDayByDay;

import java.util.Scanner;

public class ReverseAArray {

	public static void main(String[] args) {
		Scanner userObj= new Scanner(System.in);
		System.out.print("Enter the no of colums in array :- ");
		int colsInArray=userObj.nextInt();

		int numberArray[]=new int[colsInArray];
		int reverseArray[]=new int[colsInArray];

		for(int ctr=0;ctr<colsInArray;ctr++) {
			System.out.print("Enter value for array index "+ ctr +" :- ");
			numberArray[ctr]=userObj.nextInt();
		}
		System.out.print("Input array is :- ");
		for(int copyOfNumberArray:numberArray) {
			System.out.print(copyOfNumberArray+"  ");
		}

		for(int counter=0,counter1=1;counter<numberArray.length;counter++,counter1++) {

			reverseArray[counter]=numberArray[colsInArray-counter1];			//adding another variable to reduce size
			//reverseArray[counter]=numberArray[colsInArray-counter -1];		//without using another variable for reducing length value
			//reverseArray[counter]=numberArray[--colsInArray];					//directly by reducing value of column size
		}
		System.out.println();
		System.out.print("Reverse array is :- ");
		for(int copyOfReverseArray : reverseArray) {
			System.out.print(copyOfReverseArray+"  ");
		}
	}

}
