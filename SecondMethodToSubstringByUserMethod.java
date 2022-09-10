package com.problemsDayByDay;

import java.util.Scanner;

public class SecondMethodToSubstringByUserMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int startIndex;
		int endIndex=0;
		Scanner userObj=new Scanner(System.in);
		System.out.print("Enter sentence to check substring :- ");
		String sentenceLine=userObj.nextLine();

		System.out.print("Enter from which index you want to start to substring:-");
		startIndex=userObj.nextInt();
		System.out.print("Enter from which index you want to stop to substring upto "+sentenceLine.length()+" / Enter 0 for show upto last index :-");
		endIndex=userObj.nextInt();
		String subString="";
		int exitIndex=endIndex;
		if(exitIndex==0) {
			for(int ctr=startIndex;ctr<sentenceLine.length();ctr++) {
				System.out.print(sentenceLine.charAt(ctr));

			}
		}
		else {
			for(int ctr=startIndex;ctr<exitIndex;ctr++) {
				System.out.print(sentenceLine.charAt(ctr));
			}
		}
	}

}
