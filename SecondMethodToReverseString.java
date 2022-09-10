package com.problemsDayByDay;

import java.util.Scanner;

public class SecondMethodToReverseString {

	SecondMethodToReverseString(String inputText) {					//constructor for display input String
		System.out.println("Given String for reversing :- "+inputText);
	}

	void reverseStringDirect(String inputText) {					//user-defined method for direct output by for loop
		System.out.println("-------------Direct output Method-------------------");

		char userArr[]= new char[inputText.length()];

		int num=1;
		for(int ctr= 0;ctr<inputText.length();ctr++) {
			userArr[ctr]=inputText.charAt(inputText.length()- num);
			num++;
		}
		System.out.print("Reverse String output :- ");
		System.out.println(userArr);
	}


	void reverseStringWithNestedLoops(String inputText) {					//method for reverse String by Nested loops
		System.out.println("--------Reverse String Using nested loops-----------");

		char inputArray[]= new char[inputText.length()];				//char array to store reverse string
		int counter=0;
		int indexValue = 1;
		while(counter < inputText.length()) {

			int counter2=1;

			while(counter2<inputText.length()) {
				int indexNum=inputText.length()- indexValue;			//accept index value from last index

				inputArray[counter]= inputText.charAt(indexNum);			//store character from index defined in charAt function

				counter2++;
			}
			indexValue++;
			counter++;
		}
		System.out.print(" Reverse String is :- ");
		for(char reverseArr : inputArray ) {				//for each array
			System.out.print(reverseArr);
		}
	}

	public static void main(String[] args) {

		Scanner scanObj= new Scanner (System.in);

		System.out.print("Enter String to reverse it :- ");
		String inputText = scanObj.nextLine();

		SecondMethodToReverseString reverseStrObj= new SecondMethodToReverseString(inputText);
		System.out.println("------------------------------------------");
		reverseStrObj.reverseStringDirect(inputText);
		System.out.println("------------------------------------------");
		reverseStrObj.reverseStringWithNestedLoops(inputText);

	}
}


