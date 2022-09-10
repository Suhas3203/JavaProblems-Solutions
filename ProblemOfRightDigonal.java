package com.problemsDayByDay;

import java.util.Scanner;

public class ProblemOfRightDigonal {

	public static void main(String[] args) {

		Scanner scanObj= new Scanner(System.in);

		System.out.print("Enter number of rows in Matrix (1 - 10):- ");
		int rowsOfMatrix=scanObj.nextInt();

		System.out.print("Enter number of colums in Matrix (2 - 10):- ");
		int columsOfMatrix=scanObj.nextInt();
		System.out.println("------------------------------------------");
		int numberMatrix[][]=new int[rowsOfMatrix][columsOfMatrix];

		for(int counter=0;counter<rowsOfMatrix;counter++) {
			int ctr=0;
			for(;ctr<columsOfMatrix;ctr++) {
				System.out.print("Enter Value for "+ counter + "th row " + ctr + "th column :- ");
				int indexValue = scanObj.nextInt();
				numberMatrix[counter][ctr]=indexValue;
			}
		}
		System.out.println("----------Entered Matrix---------------- ");
		for(int counter2=0;counter2<rowsOfMatrix;counter2++) {
			int ctr2=0;
			for(;ctr2<columsOfMatrix;ctr2++) {

				System.out.print(numberMatrix[counter2][ctr2] + "    ");
			}
			System.out.println();
		}

		int sum=0;
		for(int counter3=0;counter3<rowsOfMatrix;counter3++) {
			int ctr3=0;
			for(;ctr3<columsOfMatrix;ctr3++) {
				if(counter3 == 0) {
					if(ctr3 == columsOfMatrix-1) {
						sum+=numberMatrix[counter3][ctr3];
						numberMatrix[counter3][ctr3]= 0;
					}
				}
				else if(counter3 == 1) {
					if(ctr3 == columsOfMatrix -2) {
						sum+=numberMatrix[counter3][ctr3];
						numberMatrix[counter3][ctr3]= 0;
					}
				}
				else if(counter3 == 2) {
					if(ctr3==columsOfMatrix-3) {
						sum+=numberMatrix[counter3][ctr3];
						numberMatrix[counter3][ctr3]= 0;
					}
				}
				else if(counter3 == 3) {
					if(ctr3==columsOfMatrix-4) {
						sum+=numberMatrix[counter3][ctr3];
						numberMatrix[counter3][ctr3]= 0;
					}
				}
				else if(counter3 == 4) {
					if(ctr3==columsOfMatrix-5) {
						sum+=numberMatrix[counter3][ctr3];
						numberMatrix[counter3][ctr3]= 0;
					}
				}
				else if(counter3 == 5) {
					if(ctr3==columsOfMatrix-6) {
						sum+=numberMatrix[counter3][ctr3];
						numberMatrix[counter3][ctr3]= 0;
					}
				}
				else if(counter3 == 6) {
					if(ctr3==columsOfMatrix-7) {
						sum+=numberMatrix[counter3][ctr3];
						numberMatrix[counter3][ctr3]= 0;
					}
				}
				else if(counter3 == 7) {
					if(ctr3==columsOfMatrix-8) {
						sum+=numberMatrix[counter3][ctr3];
						numberMatrix[counter3][ctr3]= 0;
					}
				}
				else if(counter3 == 8) {
					if(ctr3==columsOfMatrix-9) {
						sum+=numberMatrix[counter3][ctr3];
						numberMatrix[counter3][ctr3]= 0;
					}
				}
				else if(counter3 == 9) {
					if(ctr3==columsOfMatrix-10) {
						sum+=numberMatrix[counter3][ctr3];
						numberMatrix[counter3][ctr3]= 0;
					}
				}

			}
		}
		System.out.println("------Right Digonals to be 0----------------");

		for(int counter4=0;counter4<rowsOfMatrix;counter4++) {
			int ctr4=0;
			for(;ctr4<columsOfMatrix;ctr4++) {

				System.out.print(numberMatrix[counter4][ctr4] + "    ");
			}
			System.out.println();
		}
		System.out.println("--------------------------------------------");
		System.out.println("Sum of all Right digonals :- " + sum);
	}

}
