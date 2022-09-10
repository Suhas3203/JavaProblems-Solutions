package com.problemsDayByDay;

public class ProblemsOfIntArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arrOfNumbers[]= {27,-155,51,8,0,-11,23,5,-124,28,77,-135,211,7,-55};
		
		for(byte counter=0;counter<=arrOfNumbers.length-1;counter++) {
			
		//	System.out.println(arrOfNumbers[counter]);
			
			if(arrOfNumbers[counter]>0 && arrOfNumbers[counter] % 2==0) {
				System.out.println("Number "+arrOfNumbers[counter]+" is a Positive Number & Divisible by 2");
			}
			else if(arrOfNumbers[counter]<0 && arrOfNumbers[counter] % 2==0) {
				System.out.println("Number "+arrOfNumbers[counter]+" is a Negative Number & Divisible by 2");
			}
			else if(arrOfNumbers[counter]>0 && arrOfNumbers[counter] % 2!=0) {
				System.out.println("Number "+arrOfNumbers[counter]+" is a Positive Number & Not Divisible by 2");
			}
			else if(arrOfNumbers[counter]<0 && arrOfNumbers[counter] % 2!=0) {
				System.out.println("Number "+arrOfNumbers[counter]+" is a Negative Number & Not Divisible by 2");
			}
			else {
				System.out.println("Given Number is neither Positive nor Negative Because This Value "+ arrOfNumbers[counter] +" is Zero.");
			}
		}
		
		System.out.println(".................................................");
		
		
	}

}
