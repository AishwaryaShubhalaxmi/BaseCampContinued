package Hackerrank;
import java.util.*;
public class StringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of the string");
		int n=sc.nextInt();
		String temp=" ";
		String[] s= new String[n];
		System.out.println("Enter the array elements");
		for(int i=0;i<n;i++){
			s[i]=sc.next();
		}
		for(int i=0; i<n;i++){
			System.out.println(s[i]);
		}
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(s[i].compareTo(s[j])>=0){
					temp=s[i];
					s[i]=s[j];
					s[j]=temp;
					
				}
			}
			System.out.println(s[i]);
		}
       }

}
