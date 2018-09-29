import java.util.*;
public class duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
int count=0;
int c;
System.out.println("Enter the size of array");
int n=sc.nextInt();
int arr[]= new int[n];
System.out.println("Enter the array elements");
for(int i=0;i<n;i++){
	arr[i]=sc.nextInt();
	}
for(int i=0;i<n;i++){
	for(int j=i+1;j<n;j++){
		if(arr[i]==arr[j]){
			count++;
			}
		}
	}System.out.println(count);
}

}
