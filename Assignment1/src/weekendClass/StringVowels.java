package weekendClass;
import java.util.*;
public class StringVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a string");
     String s=sc.next();
     int count=0,flag=0,temp=0;
     for(int i=0;i<s.length();i++){
    	 char ch1=s.charAt(i);
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
      System.out.println("The number of vowels is:" + count);
      System.out.println("The number of consonants is:" + flag);
      System.out.println("The number of other characters are:" + temp);
	}

}
