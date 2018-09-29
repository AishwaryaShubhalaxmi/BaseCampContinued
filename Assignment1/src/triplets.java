import java.util.*;
public class triplets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the array size");
		int s= sc.nextInt();
		System.out.println("Enter the array elements");
		int arr[]= new int[s];
		for(int i=0;i<s;i++){
			arr[i]=sc.nextInt();
			}
		System.out.println("The array is");
		for(int i=0;i<s;i++){
			System.out.println(arr[i]);
		}
		for(int i=0;i<s-2;i++){
			for(int j=i+1;j<s-1;j++){
				for(int k=j+1;k<s;k++){
					if(arr[k]==arr[i]+arr[j])
						System.out.println("The triplets are"+ " " + arr[i] + " "+ arr[j] + " "+ arr[k] );
				}
			}
		}
		
		

	}
	
		
		
	}


