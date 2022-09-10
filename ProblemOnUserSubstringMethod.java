package com.problemsDayByDay;

import java.util.Scanner;

public class ProblemOnUserSubstringMethod {
	static String userSentence;

	ProblemOnUserSubstringMethod(){
		Scanner scanObj= new Scanner(System.in);
		System.out.print("Enter Sentence you want to check the user defined substring methods :- ");
		userSentence=scanObj.nextLine();

		System.out.print("Do you want to provide start and end index or not? (please enter Y/N ) :-");
		String charForCondition=scanObj.nextLine();

		if(charForCondition.charAt(0)=='Y'|charForCondition.charAt(0)=='y') {
			System.out.print("Enter from which index you want to start to substring:-");
			int startIndex=scanObj.nextInt();
			System.out.print("Enter from which index you want to stop to substring upto "+userSentence.length()+" :-");
			int endIndex=scanObj.nextInt();
			toPrintSubstring(startIndex,endIndex);
		}

		else {
			System.out.print("Enter only start index to substring:-");
			int startIndex=scanObj.nextInt();
			toPrintSubstring(startIndex);
		}
	}
	//-------------------Methods with method overloading-------------------------
	void toPrintSubstring(int startIndex,int endIndex){							//method is applied only when start and end index is given
		System.out.print("This will be substring :- ");
		for(int ctr=startIndex;ctr<=endIndex;ctr++) {
			System.out.print(userSentence.charAt(ctr));

		}
	}

	void toPrintSubstring(int startIndex){										////method is applied only when start is given
		System.out.print("This will be substring :- ");
		for(int ctr2=startIndex;ctr2<=userSentence.length()-1;ctr2++) {
			System.out.print(userSentence.charAt(ctr2));

		}
	}

	public static void main(String[] args) {

		new ProblemOnUserSubstringMethod();
	}
}
