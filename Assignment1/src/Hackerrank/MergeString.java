package Hackerrank;

import java.util.*;

public class MergeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first string:");
		String a = sc.next();
		System.out.println("Enter the second string:");
		String b = sc.next();
		String mergestr = "";

		int size = (a.length() < b.length()) ? a.length() : b.length();

		for (int i = 0; i < size; i++) {
			mergestr += a.charAt(i);
			for (int j = i; j < i + 1; j++) {
				mergestr += b.charAt(j);
			}
		}
       if (a.length() > b.length()) {
			for (int i = size; i < a.length(); i++) {
				mergestr += a.charAt(i);

			}
		}

		if (b.length() > a.length()) {
			for (int i = size; i < b.length(); i++) {
				mergestr += b.charAt(i);
			}
		}
			
		System.out.println(mergestr);
	}
}
