package com.problemsDayByDay;

import java.util.Scanner;

public class ProblemofArmStrongNum {


	static int ctr=0;
	static int addition =0;
	static int armStrongExpression(int tempNumber) {
		int reminder;
		while( 0 < tempNumber) {
			reminder= tempNumber % 10;			//modulo for single digit
			addition = addition + (reminder*reminder*reminder);		//using * operator cube of number taken
			tempNumber = tempNumber/10;								//input number divided by 10 to again geting condition check for loop

		}
		return addition;		
	}

	static void checkArmStrongNum(int firstNumber) {
		System.out.println("--------Checking of Given Number only by if else condition ---------------------");
		if (firstNumber == addition) {								//comparing values between entered value and output value by above loop
			System.out.println( firstNumber + " is a ArmStrong Number");
			ctr++;
		}
		else {
			System.out.println( firstNumber + " is not a ArmStrong Number");
		}

		System.out.println("---------------------Checking of Number by using Ternery operator---------------------");

		System.out.println(firstNumber==addition ? firstNumber + " is a ArmStrong Number":firstNumber + " is not a ArmStrong Number");		//ternary operator used for checking is it ArmStrong Number
	}

	static void checkArmStrongNumber(int firstNumber) {

		if (firstNumber == addition) {								//comparing values between entered value and output value by above loop
			System.out.println( firstNumber + " is a ArmStrong Number");
			ctr++;
		}
		addition=0;
	}

	public static void main(String[] args) {

		Scanner initialInput = new Scanner (System.in);			//Scanner object
		System.out.print("Enter number from that how many ArmStrong Numbers till 1000000000? (0-1000000000) :- "); 
		int tempInputNumber = initialInput.nextInt();			//accept the input value
		int firstInputNumber=tempInputNumber;							//store the input value for later use
		int copyOfNumber= firstInputNumber;


		ProblemofArmStrongNum.armStrongExpression(tempInputNumber);			//expression method for defining armstrong number

		ProblemofArmStrongNum.checkArmStrongNum(firstInputNumber);		//method for checking armstrong number

		// tempInputNumber=1;

		System.out.println("------------Range of ArmStrong Numbers from Number :- "+ ++tempInputNumber +" till 1000000000-----------");
		for(;tempInputNumber < 1000000000;) {
			firstInputNumber=tempInputNumber;
			ProblemofArmStrongNum.armStrongExpression(tempInputNumber);

			ProblemofArmStrongNum.checkArmStrongNumber(firstInputNumber);		//method for checking armstrong number

			tempInputNumber++;
			//firstInputNumber++;
		}
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("Total ArmStrong Numbers from "+ copyOfNumber +" to 1000000000 :- " + ctr);
	}

}
