package programsMisc;
import java.util.*;

public class LargestElementOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the size of the array");
      int n= sc.nextInt();
      int[] a= new int[n];
      int temp=0;
      System.out.println("Enter the array elements");
      for(int i=0;i<n;i++){
    	  a[i]=sc.nextInt();
      }
      System.out.print("The array elements are:");
      for(int i=0;i<n;i++){
    	  System.out.print(a[i] + " ");
      }
      for(int i=0;i<n;i++){
    	  for(int j=i+1;j<n;j++){
    		  if(a[i]>a[j]){
    			 temp=a[i];
    			 a[i]=a[j];
    			 a[j]=temp;
    		  }
    	  } 
      }
                  System.out.println();
    	      	  System.out.println("The sorted array is:");
    	      	  for(int i=0;i<n;i++){
    	      		  System.out.print(a[i] + " ");
    	      	  }
    	      	  System.out.println();
    	      /*	  System.out.println("The largest element is: " + a[n-1] + "and the second largest element is: " + a[n-2]);
    	      	  System.out.println("The smallest element is: " + a[0] + "and the second smallest element is: " + a[1]); */
    	      	  System.out.println("The largest 3 elements are: ");
    	      	  for(int i=n-1;i>n-4;i--){
    	      		  System.out.println(a[i]);
    	      	  }
      }
	}


