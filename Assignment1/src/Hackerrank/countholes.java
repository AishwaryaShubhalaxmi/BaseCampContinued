package Hackerrank;
import java.util.*;
public class countholes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter an integer");
   
   	
   int n=sc.nextInt();
	    while(n>0){
	    	int r=n%10;
	    	if(r==1 ||r==3 ||r==7 || r==5 || r==2){
	    		int count= 0;}
	    	if(r==4 || r==6 || r==0){
	    		int count =1;
	    	}
	       if(r==8){
	    	   int count =2;
	       }
	       n=n/10;
	
	    }System.out.println(count);
	}
}

