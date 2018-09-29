import java.util.*;
public class Stringappend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter the first string:");
      String a=sc.next();
      System.out.println("Enter the second string:");
      String b=sc.next();
      String str="";
       int size=(a.length()<b.length())?a.length():b.length();
      if(size==a.length()){
      for(int i=0;i<size;i++){
    	  str+=a.charAt(i);
    	 
    	  for(int j=i;j<i+1;j++){
    		  str+=b.charAt(j);
    		  
    	  }
      }
    for(int i=str.length();i<b.length();i++){
    	  str+=a.charAt(i);
    	  
      }
      System.out.println(str);
      }
      else{
    	  for(int i=0;i<size;i++){
        	  str+=b.charAt(i);
        	  for(int j=i;j<i+1;j++){
        		  str+=a.charAt(j);
        		  
      }
    	  
      }
    	  for(int i=b.length();i<a.length();i++){
    		  str+=b.charAt(i);
    	  
    	  }
      System.out.println(str);
	} 

}
}
