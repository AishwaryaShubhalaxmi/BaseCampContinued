import java.util.*;
public class Arrayprob {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of first array");
		int n= sc.nextInt();
		int a[] = new int[n];
	    int b[] = new int[n];
		System.out.println("Enter the array elements");
		for(int i=0;i<n;i++)
		{a[i]=sc.nextInt();}
		System.out.println("The array elements are:");
		for(int i:a)
		{System.out.println(i);}
		int k=1;
		for(int i=0;i<n;i++){
			if(i==0){
				b[0]=a[0];
			}
			else if(i>0){
				int flag=0;
				for(int j=0;j<=i-1;j++){
					if(a[i]==a[j])
					{
						++flag;
						break;
					}
					
				}
				if(flag==0){
					b[k]=a[i];
					k++;
					
				}
			}
		}
		System.out.println("after deleting duplicate elements:");
		int x=k;
		for(int m=0;m<x;m++)
		{
			System.out.println(b[m]+ "");
		}
		
		
	}

}
