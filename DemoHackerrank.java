package com.problemsDayByDay;
import java.util.Scanner;
public class DemoHackerrank {


	public static void main (String args[]) {

		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

		Scanner in = new Scanner(System.in);
		int t=in.nextInt();
		int s = 0;
		for(int i=0;i<t;i++){
			int a = in.nextInt();
			int b = in.nextInt();
			int n = in.nextInt();
			int valueOfPower=1;
			int valueOfExpression=0;
			for(int ctr =1;ctr<=n;ctr++) {

				valueOfExpression+=a+valueOfPower*b;
				valueOfPower*=2;
				System.out.print(valueOfExpression+" ");

			}
			System.out.println();
		}
		in.close();

	}

	//	2
	//	0 2 10
	//	5 3 5

	//	2 6 14 30 62 126 254 510 1022 2046
	//	8 14 26 50 98
}




/*
int i = scan.nextInt();
double d=scan.nextDouble();
String s=scan.nextLine()+ scan.nextInt();

// Write your code here.

System.out.println("String: " + s);
System.out.println("Double: " + d);
System.out.println("Int: " + i);

 */

/*
Scanner scan = new Scanner(System.in);

int applicationNumber=scan.nextInt();
double loanAmount=scan.nextDouble();
scan.nextLine();
String descriptionOfProcess=scan.nextLine();

System.out.println("int :- "+ applicationNumber);
System.out.println("double :- "+ loanAmount);
System.out.println("string :- "+ descriptionOfProcess);
 */

/*
//Complete this line
if(x1==0){
System.out.println(s1+"          00"+x1);
System.out.println(s2+"     0"+x2);
System.out.println(s3+"           0"+x3);
}
else{
System.out.println(s1+"           "+x1);
System.out.println(s2+"            0"+x2);
System.out.println(s3+"         0"+x3);
}

 */


/*
	Scanner scObj=new Scanner(System.in);
	System.out.println("================================");
	for(int i=0;i<1;i++){
		String s1=scObj.next();
		int x1=scObj.nextInt();
		String s2=scObj.next();
		int x2=scObj.nextInt();
		String s3=scObj.next();
		int x3=scObj.nextInt();



		int lengthOfS1=s1.length();
		int lengthOfS2=s2.length();
		int lengthOfS3=s3.length();

		int num1=x1;
		int num2=x2;
		int num3=x3;

		System.out.print(s1);
		while(lengthOfS1<15){
			System.out.print(" ");
			lengthOfS1++;
		}
		int ctr=0;
		int rem = 1;
		for(;ctr<=3 && x1!=0;ctr++) {
			rem= x1%10;
			x1/=10;
		}
		if(ctr==0) {
			System.out.print("00"+num1);
		}
		else if(ctr==1) {
			System.out.print("00"+num1);
		}
		else if(ctr==2) {
			System.out.print("0"+num1);
		}
		else {
			System.out.print(num1);
		}
		System.out.println();


		System.out.print(s2);
		while(lengthOfS2<15){
			System.out.print(" ");
			lengthOfS2++;
		}
		int ctr1=1;
		for(;ctr1<=3 && x2!=0;ctr1++) {
			rem= x2%10;
			x2/=10;
		}
		if(ctr1==0){
			System.out.print("00"+num3);
		}
		else if(ctr1==1) {
			System.out.print("00"+num2);
		}
		else if(ctr1==2) {
			System.out.print("0"+num2);
		}
		else if(ctr1==3){
			System.out.print("0"+num2);
		}
		else{
			System.out.print(num2);
		}
		System.out.println();



		System.out.print(s3);
		while(lengthOfS3<15){
			System.out.print(" ");
			lengthOfS3++;
		}
		int ctr2=1;
		for(;ctr2<=3 && x3!=0;ctr2++) {
			rem= x3%10;
			x3/=10;
		}
		if(ctr2==0){
			System.out.print("00"+num3);
		}
		else if(ctr2==1) {
			System.out.print("0"+num3);
		}
		else if(ctr2==2) {
			System.out.print("0"+num3);
		}
		else if(ctr2==3) {
			System.out.print("0"+num3);
		}
		else {
			System.out.print(num3);
		}

		System.out.println();

	}

	System.out.println("================================");
 */

/*
Scanner scObj=new Scanner(System.in);
int N = scObj.nextInt();
int multiplication=0;
for(int ctr=1;ctr<=10;ctr++){
	multiplication= N * ctr;
	System.out.print(N + " x "+ctr);
	System.out.println(" = "+multiplication);
}
 */

/*
Scanner sc=new Scanner(System.in);
System.out.println("================================");
for(int i=0;i<3;i++)
{
	String s1=sc.next();
	int x=sc.nextInt();
	System.out.printf( "%-15s%03d %n", s1, x);
}
System.out.println("================================");
 */




/*			--------------Array Problem-----------------------
void function_Set_Arrey(int noOfValues) {
	int arrey[] = new int [noOfValues];

	System.out.println();
	for (int ctr = 0; ctr <= arrey.length-1; ctr++) {
		System.out.print("Enter "+ctr+"th value : ");
		Scanner scannerObj = new Scanner(System.in);
		int valuesOfArrey = scannerObj.nextInt();
		arrey[ctr] = valuesOfArrey;
	}

	System.out.println();
	System.out.println("Given arrey are: ");
	System.out.print("[");
	for (int Arrey : arrey) {
		System.out.print(" "+Arrey+" ");
	}
	System.out.println("]");


	System.out.println();
	System.out.println("------------------- Method 1");
	System.out.println("Reverse arrey are: ");
	System.out.print("[");
	for(int ctr1 = arrey.length-1; ctr1 >=0; ctr1--) {
		System.out.print(" "+ arrey[ctr1] +" ");
	}
	System.out.println("]");


	System.out.println();
	System.out.println("------------------- Method 2");

	System.out.println("Reverse arrey are: ");
	System.out.print("[");

	for(int ctr3 = 0; ctr3< arrey.length/2; ctr3++) {

		int hold = arrey[ctr3];
		arrey[ctr3] = arrey[arrey.length-ctr3-1];
		arrey[arrey.length-ctr3-1] = hold;
	}
	for(int reverseArr:arrey) {
		System.out.print(" "+reverseArr +" ");
	}

	System.out.println("]");
}


public static void main(String[] args) {


	Scanner scannerObj = new Scanner(System.in);
	System.out.print("Enter how meany numbers you entered in arrey...: ");
	int noOfValues = scannerObj.nextInt();

	DemoHackerrank object_Set_Arrey = new DemoHackerrank();
	object_Set_Arrey.function_Set_Arrey(noOfValues);

 */