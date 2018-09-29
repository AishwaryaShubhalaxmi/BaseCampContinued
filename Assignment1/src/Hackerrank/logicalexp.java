package Hackerrank;

import java.util.Scanner;

public class logicalexp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter first bit ");
		int a=sc.nextInt();
		System.out.println("Enter second bit ");
		int b=sc.nextInt();
		if((a==0 && b==0) || (a==1 && b==1)){
			System.out.println("XOR operation gives 0");}
			if((a==1 && b==0)|| (a==0 && b==1)){
				System.out.println("XOR operation gives 1");}
			}
		
	}


