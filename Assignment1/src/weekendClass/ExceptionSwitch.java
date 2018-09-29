package weekendClass;

import java.util.Scanner;

public class ExceptionSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc= new Scanner(System.in);
	      System.out.println("Enter a string");
	      String s= sc.next();
	      try{
	    	  if(s.length()>1){
	    		  throw new Exception("Length should not be greater than 1");
	    	  }
	    	  char temp= Character.toLowerCase(s.charAt(0));
	    	  if(temp <'a' || temp > 'z'){
	    		  throw new Exception("Not a character");
	    	  }
	    	     switch(temp){
	    	     
	    	       case ('a'):
	    	       case('e'):
	    	       case('i'):
	    	       case('o'):
	    	       case('u'):
	    	       System.out.println("Vowel");
	    	       break;
	    	       default:
	    	    	   System.out.println("Consonant");}
	    	     }
		         catch(Exception e){ 
		        	 System.out.println("Invalid character");
			
	    	     
	      }

	}

}
