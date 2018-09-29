import java.util.*;
public class TestUSN {

   public static boolean validate(String s){
	   char ch;
	   if(s.length()!=10){System.out.println("first character is not correct");
		 return false;}
	   ch=s.charAt(0);
	   if(ch!='1'&& ch!='2'){System.out.println("first character is not correct");
		   return false;}
	   ch=s.charAt(1);
	   if(Character.isLowerCase(ch)){System.out.println("second character is not correct");
		   return false;}
	   ch=s.charAt(2);
	   if(Character.isLowerCase(ch)){System.out.println("third character is not correct");
		   return false;}
	   ch=s.charAt(3);
	   if(!Character.isDigit(ch)){System.out.println("fourth character is not correct");
		   return false;}
	   ch=s.charAt(4);
	   if(!Character.isDigit(ch)){System.out.println("fifth character is correct");
		   return false;}
	   String t=s.substring(5,7);
	  
			   if(!(t.equals("CS") || t.equals("IS") || t.equals("EC") || t.equals("ME")))
			   {System.out.println("sixth and seventh characters not correct");
			   System.out.println(t);
				   return false;}
	   ch=s.charAt(7);
	   if(!Character.isDigit(ch)){System.out.println("eighth character is not correct");
		   return false;}
	   ch=s.charAt(8);
	   if(!Character.isDigit(ch)){System.out.println("ninth character is not correct");
		   return false;}
	   ch=s.charAt(9);
	   if(!Character.isDigit(ch)){System.out.println("tenth character is not correct");
		   return false;}
		   
	  return true; 
   }

 public static void main(String[] args){
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the USN");
	 String USN=sc.next();
	if( validate(USN))
		System.out.println("Success");
	else
		System.out.println("Failure");
 }
}
		
	 
	 

