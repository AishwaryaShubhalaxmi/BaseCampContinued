package Hackerrank;
import java.util.*;
class Customer{
	String name;
	int id;
	double rating;
	Customer(){
		
	}
	Customer(String n,int i,double r){
		name=n;
		id=i;
		rating=r;
	}
	
   void setvalue(String s){
	   name=s;
	    }
   void setvalue1(int j){
	   id=j;
   }
   void setvalue2(double d){
	   rating=d;
   }
   String getvalue() {
	   return name;
	   }
   int getvalue1(){
	   return id;
	   }
   double getvalue2(){
	   return rating;
   }
}
public class program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of students");
		int n=sc.nextInt();
		Customer[] cus= new Customer[n];
		for(int i=0;i<n;i++){
			cus[i]= new Customer();
		}
		
      System.out.println("The details of customer are:");
      for(int i=0;i<n;i++){
    	  
      }
	}

}
