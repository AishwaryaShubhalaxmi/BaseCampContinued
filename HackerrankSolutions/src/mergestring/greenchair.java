package mergestring;
import java.util.*;
class chair{
	String name;
	int number;
	String colour;
	void display(){
		System.out.println("This is chair class");
	}
}

public class greenchair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n= sc.nextInt();
	 chair[] c=new chair[n];
	 int count=0;
      for(int i=0;i<n;i++){
    	   //c[i].name="kalinga";  
    	 c[i]=new chair();
    	  }
      System.out.println("Enter the names"); 
         for(int i=0;i<n;i++){
    	 // c[i].name="kalinga";
    	  c[i].name=sc.next();
    	 
      }
       
        
     for(int i=0;i<n;i++){
    	  if((c[i].name).length()<=6)
    	  System.out.println(i + " " + c[i].name );
      else 
    	  System.out.println(""); 
      
      }
       
       
      }
}

      
      
	


