package weekendClass;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	       System.out.println("Enter a character");
	     //  char ch1= sc.next().charAt(0);
	       String s= sc.next();
	       char ch= Character.toUpperCase(s.charAt(0));
	       if(s.length()==1){
	      if(Character.isLetter(ch)==true){
	       switch(ch){
	       case ('A'):
	    	 //  System.out.println("Vowel");
	          //  break;
	       case('E'):
	    	  // System.out.println("Vowel");
	    //   break;
	       case('I'):
	    	 //  System.out.println("Vowel");
	      // break;
	       case('O'):
	    	//   System.out.println("Vowel");
	     //  break;
	       case('U'):
	       System.out.println("Vowel");
	       break;
	       default:
	    	   System.out.println("Consonant");}
	  
	        } else{
	        	System.out.println("Invalid entry");
	        }
	       }
	      else{
	    	  System.out.println("Invalid character");
	      }
	      
	       
	}

}
