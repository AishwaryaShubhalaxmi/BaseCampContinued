import java.util.*;
public class consecutivestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the string");
         String s=sc.next();
         int count=1;
         String fstr="";
         for(int i=0; i<s.length()-1;i++){
        	if( s.charAt(i)==s.charAt(i+1)){
        		count++;
        		
        	}
        	else{
        		System.out.println(fstr+= s.charAt(i)+ count+ " ");
        		count=1;
        	}
        	 
        	 }
        	 }
         }

	
