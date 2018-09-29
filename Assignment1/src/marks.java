import java.util.*;
public class marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      Scanner sc= new Scanner(System.in);
      System.out.println("Ener the total number of subjects");
 
  
      int n= sc.nextInt();
      int arr[]= new int[n];
      System.out.println("Enter the marks");
		for(int i=0;i<n;i++)
		{
	     arr[i]=sc.nextInt();
		}
		for(int i:arr)
		{
		System.out.println(i);
		}
	int sum=0;
	for(int i=0;i<n;i++){
		sum= sum + arr[i];
	}
	float percent= sum/n;
	System.out.println("Total marks=" + sum);
	System.out.println("Percentage=" + percent);
		}
	}


