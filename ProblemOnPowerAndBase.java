package com.problemsDayByDay;

import java.util.Scanner;

public class ProblemOnPowerAndBase {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t=in.nextInt();

		for(int i=0;i<t;i++){
			int a = in.nextInt();
			int b = in.nextInt();
			int n = in.nextInt();
			int valueOfPower=1;
			int valueOfExpression=0;
			for(int ctr =1;ctr<=1;ctr++) {

				valueOfExpression+=a+valueOfPower*b;
				valueOfPower*=2;
				System.out.print(valueOfExpression+" ");

			}
			for(int ctr =2;ctr<=n;ctr++) {

				valueOfExpression+=valueOfPower*b;
				valueOfPower*=2;
				System.out.print(valueOfExpression+" ");

			}
			System.out.println();
		}
		in.close();
		// Input:-
		//		2
		//	0 2 10
		//	5 3 5

		//Output:-
		//	2 6 14 30 62 126 254 510 1022 2046
		//	8 14 26 50 98
	}

}
