package Hackerrank;

import java.util.Scanner;

public class logical {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int a=sc.nextInt();
		if(a>=0 && a<=9){
			System.out.println(a + " is a digit");
		}
		else{
			System.out.println(a + " is a number");
		}
	}

}
