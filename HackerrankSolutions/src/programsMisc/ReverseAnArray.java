package programsMisc;
import java.util.*;
public class ReverseAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the size of the array");
      int n= sc.nextInt();
      int[] a= new int[n];
      int[] rev=new int[n];
      int k=0;
      System.out.println("Enter the array elements");
      for(int i=0;i<n;i++){
    	  a[i]= sc.nextInt();
      }
      System.out.println("The array elements are:");
      for(int i=0;i<n;i++){
    	  System.out.print(a[i] + " ");
      }
      System.out.println();
      for(int j=n-1;j>=0;j--){
    	  rev[k]=a[j];
    	  k++;
    	  
      }
      System.out.println("The reverse array is:");
      for(int i=0;i<n;i++){
      System.out.print(rev[i] + " ");
      
	}

}
}
