package com.problemsDayByDay;


import java.util.Scanner;

public class ProblemToReverseString {

	ProblemToReverseString(String inputText) {				//Parameterized constructor used
		System.out.println(" Given String is :- "+inputText);

	}

	void reverseText(String inputText) {					//user defined method  for reversing String
		char textArr[]= new char[inputText.length()];		//array for accepting every character from last to first

		int counter=1;
		for(short ctr=0;ctr<inputText.length();ctr++) {							//loop for 1 by 1 character taking in array for reverse output
			textArr[ctr]= inputText.charAt(inputText.length()-counter++);			//storing character at that position defined in expression
		//	counter++;
		}
		System.out.print(" Reverse String is :- ");						
		for( char reverseArr :  textArr) {										//for each loop to show output of each index in character array
			System.out.print(reverseArr);
		}
	}

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);

		System.out.print("Enter string you want to reverse :- ");
		String inputText= userInput.nextLine();												//Accept String for reversing
		ProblemToReverseString reverseString = new ProblemToReverseString(inputText);		//object of reverseString class
		reverseString.reverseText(inputText);												//user defined method called from reverseString class 

	}
}
