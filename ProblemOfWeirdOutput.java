package com.problemsDayByDay;

import java.util.Scanner;

public class ProblemOfWeirdOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput= new Scanner(System.in);
		System.out.print("Enter Number (1 - 127) :- ");
		byte givenNumber = userInput.nextByte();

		for(byte ctr=givenNumber;ctr==givenNumber;ctr++) {
			if(ctr % 2 ==0 && 2<= ctr) {
				if(ctr<=5) {
					System.out.println("Given Value " + ctr + " is Not Weird");
				}
				else if(ctr<=20) {
					System.out.println("Given Value " + ctr + " is Weird");
				}
				else {
					System.out.println("Given Value " + ctr + " is Not Weird");
				}
			}
			else {
				System.out.println("Given Value " + ctr + " is Weird");
			}
		}
	}
}


