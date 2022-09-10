package com.problemsDayByDay;

import java.util.Scanner;

public class ProblemOnDigonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userObj= new Scanner(System.in);

		System.out.print("Enter Number of Rows in MultiDimensional Array :- ");
		short rowsOfMatrix= userObj.nextShort();			//rows for multiDimensional Array
		System.out.println();
		System.out.print("Enter Number of Columns in MultiDimensional Array :- ");
		short columsOfMatrix= userObj.nextShort();		//columns for multiDimensional Array
		System.out.println();
		short userMatrix[][]= new short[rowsOfMatrix][columsOfMatrix];			//Declared multiDimensional Array

		short ctr=0;
		while (ctr < rowsOfMatrix) {						//loop for put values of each indexes
			short ctr1 = 0;
			while (ctr1 < columsOfMatrix) {
				System.out.println("Enter Value for "+ ctr + " th row And "+ ctr1 +" th column :-");
				userMatrix[ctr][ctr1]=userObj.nextShort();		//Input every Matrix diagonal value
				ctr1++;
			}
			ctr++;
		}
		System.out.println("Now this will be Input Matrix:- ");

		short ctr2 = 0;
		while (ctr2 < rowsOfMatrix) {

			short ctr1 = 0;
			while (ctr1 < columsOfMatrix) {

				System.out.print(userMatrix[ctr2][ctr1] + "        ");		//Matrix of values given above
				ctr1++;
			}
			System.out.println();
			ctr2++;
		}
		System.out.println("-----------------------------------------");
		
		System.out.println("------ Digonal Values should be 0 ------");
		short ctr3 = 0;
		while (ctr3 < rowsOfMatrix) {

			short ctr1 = 0;
			while (ctr1 < columsOfMatrix) {
				if(ctr3==ctr1) {
					System.out.print(0 +"        ");		//Give Value as 0 for digonal index
				}
				else {
				System.out.print(userMatrix[ctr3][ctr1] + "        ");		//other Matrix values given above
				}
				ctr1++;
			}
			System.out.println();
			ctr3++;
		}
		System.out.println("----------------------------------------");
	}

}
