package com.problemsDayByDay;

import java.util.Scanner;

public class ProblemOnVowelsAndConsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sentenceInput = new Scanner(System.in);
		System.out.print("Enter the Statement which you want to check:- ");
		String strVal = sentenceInput.nextLine();

		int vowels = 0;
		int whiteSpaces = 0;
		int consonants = 0;
			System.out.println("----------------- By Using if and else conditions ---------------------------");
		for(int counter=0;counter<=strVal.length()-1;counter++) {
			if(strVal.charAt(counter)=='a' || strVal.charAt(counter)=='A' ||
					strVal.charAt(counter)=='e' || strVal.charAt(counter)=='E' ||
					strVal.charAt(counter)=='i' || strVal.charAt(counter)=='I' ||
					strVal.charAt(counter)=='o' || strVal.charAt(counter)=='O' ||
					strVal.charAt(counter)=='u' || strVal.charAt(counter)=='U' ) {
				System.out.print(strVal.charAt(counter)+",");	//Vowels in Statements
				vowels++;
			}
			else if(strVal.charAt(counter)==' ') {
				whiteSpaces++;
			}
			else {
				//		System.out.print(strVal.charAt(counter) +",");		//Consonants in Statements
				consonants++;
			}
		
		}
		System.out.println();
		System.out.println(" Vowels in Statements are " + vowels);
		System.out.println(" whitespaces in Statements are " + whiteSpaces);
		System.out.println(" Consonants in Statements are " + consonants);


		System.out.println("---------------- By Using Switch cases ----------------");

		int vowelsInSwitch= 0;
		int whiteSpacesInSwitch = 0;
		int consonantsInSwitch= 0;
		for(int ctr=0;ctr<=strVal.length()-1;ctr++) {
			switch (strVal.charAt(ctr)){ 
			case 'a':
			case 'A':
			case 'e':
			case 'E':
			case 'i':
			case 'I':
			case 'o':
			case 'O':
			case 'u':
			case 'U':
				vowelsInSwitch++;
				break;
			case ' ':
				whiteSpacesInSwitch++;
				break;
			default :
				consonantsInSwitch++;
			}
		}
		System.out.println(" Vowels in Statements are " + vowelsInSwitch);
		System.out.println(" Whitespaces in Statements are " + whiteSpacesInSwitch);
		System.out.println(" Consonants in Statements are " + consonantsInSwitch);
	}
}


