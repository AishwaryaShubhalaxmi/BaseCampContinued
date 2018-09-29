package weekendClass;
import java.util.*;
public class StringArrayVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the size of the array");
       int n= sc.nextInt();
       int count=0, flag=0,temp=0;
       System.out.println("Enter a string array");
       String[] s= new String[n];
       for(int i=0;i<n;i++){
    	   s[i]=sc.next();
       }
       for(int i=0;i<s.length;i++){
    	   for(int j=0;j< s[i].length();j++){
    		   char ch1=s[i].charAt(j);
    	    	 char ch= Character.toLowerCase(ch1);
    	    	 if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
    	    		 count++;
    	    	 }
    	    	 else if(!(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') && (Character.isLetter(ch)== true)){
    	    		 flag++;
    	    		 
    	    	 }
    	    	 else{
    	    		 temp++;
    	    	 }
    	     
    	   }
	       
    	      System.out.println("The number of vowels  in " + s[i] + " is " + count);
    	      System.out.println("The number of consonants in " + s[i] + " is " + flag);
    	      System.out.println("The number of other characters in " + s[i] + " is " + temp);
	          count=0; temp=0; flag=0;
    	  }
    	   
       }
	}


