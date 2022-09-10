package com.problemsDayByDay;

import java.util.Scanner;

public class ProblemOnMultiDArray {
	
	
	static int toCalculateFactorialOfNum(int userNumber){
		int ctr = 2, factorial= 1;
		while(ctr <= userNumber){
			factorial *= ctr; 
			ctr++;
		}
		/*
		for(; 1 < userNumber;) {								//condition for value will decrement upto 1
		factorial*=userNumber;							//increase the value of variable by multiplication at every time when condition will be true
		userNumber--;
	}				*/
	return factorial;
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userObj = new Scanner(System.in);		//Scanner object

		System.out.print("Enter Number of Rows in MultiDimensional Array :- ");
		short rowsOfArray= userObj.nextShort();			//rows for multiDimensional Array
		System.out.println();
		System.out.print("Enter Number of Columns in MultiDimensional Array :- ");
		short columsOfArray= userObj.nextShort();		//columns for multiDimensional Array
		System.out.println();
		short userArray[][]= new short[rowsOfArray][columsOfArray];			//Declared multiDimensional Array

		short counter=0;
		while (counter < rowsOfArray) {						//loop for put values of each indexes
			short counter1 = 0;
			while (counter1 < columsOfArray) {
				System.out.println("Enter Value for "+ counter + " th row And "+ counter1 +" th column :-");
				userArray[counter][counter1]=userObj.nextShort();		//Input every Array value
				counter1++;
			}
			counter++;
		}
		System.out.println("Now this will be Input Array:- ");

		short counter2 = 0;
		while (counter2 < rowsOfArray) {

			short counter1 = 0;
			while (counter1 < columsOfArray) {

				System.out.print(userArray[counter2][counter1] + "        ");		//array of values given above
				counter1++;
			}
			System.out.println();
			counter2++;
		}
		System.out.println("---------------------------");
		short counter3 = 0;
		while (counter3 < rowsOfArray) {

			short counter1 = 0;
			while (counter1 < columsOfArray) {
				if(userArray[counter3][counter1] % 2==0) {					//for even condition
					if (userArray[counter3][counter1]> 0) {					//about positive number condition
						System.out.println("Given Index "+counter3+counter1+" have Value "+ userArray[counter3][counter1] + " is a Positive Number"+" and Number is even");
					}
					else if(userArray[counter3][counter1]< 0) {				//about negative number condition
						System.out.println("Given Index "+counter3+counter1+" have Value "+ userArray[counter3][counter1] + " is a Negative Number"+" and Number is even");
					}
					else {
						System.out.println("Given Index "+counter3+counter1+" have Value "+ userArray[counter3][counter1] + " Given Number is zero.");
					}
				}
				else {
					if (userArray[counter3][counter1]> 0) {						//for odd condition
						System.out.println("Given Index "+counter3+counter1+" have Value "+ userArray[counter3][counter1] + " is a Positive Number"+" and Number is odd");
					}
					else if(userArray[counter3][counter1]< 0) {
						System.out.println("Given Index "+counter3+counter1+" have Value "+ userArray[counter3][counter1] + " is a Negative Number"+" and Number is odd");
					}
					else {
						System.out.println("Given Index "+counter3+counter1+" have Value "+ userArray[counter3][counter1] + " Given Number is zero.");
					}
				}
				counter1++;
			}
			System.out.println();
			counter3++;
		}

		System.out.println("---------------- Factorial of Value given by Input Number ----------------");

		System.out.print("Enter The Number (1-32467) :- ");
		short userNumber = userObj.nextShort();					//Input value for factorization 
		short initialNumber=1;
		for(; 1 < userNumber;) {								//condition for value will decrement upto 1
			 initialNumber*=userNumber;							//increase the value of variable by multiplication at every time when condition will be true
			userNumber--;
		}
		System.out.println("Factorial is =" + initialNumber );

		System.out.println("------------ Factorial of Array ----------------");
		short counter4 = 0;
		while (counter4 < rowsOfArray) {

			short counter1 = 0;

			while (counter1 < columsOfArray) {
				short initNumber = 1;
				while(userArray[counter4][counter1] > 1 ) {					//check values of each array element which should be greater then 1 after executing loop
					initNumber*= userArray[counter4][counter1];				// multiply value each time to get factorial
					userArray[counter4][counter1]--;						// decrement the value of number given by 1 each time
				}
				System.out.print(" Factorial of Array Number is :- " +initNumber +"        ");
				counter1++;
			}
			System.out.println();
			counter4++;
		}
		 
	}
}
