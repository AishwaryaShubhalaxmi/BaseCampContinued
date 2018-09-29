import java.util.*;
public class typecast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the first array");
		System.out.println("Enter the size of the second array");
		int s1=sc.nextInt();
		int s2=sc.nextInt();
		double arrA[]= new double[s1];
		double arrB[]= new double[s2];
		System.out.println("Enter the elements of the first array");
		for(int i=0;i<s1;i++){
		 arrA[i]= sc.nextDouble();}
		System.out.println("The first array is");
		for(int i=0;i<s1;i++){
			System.out.println(arrA[i]);
		}
		System.out.println("Enter the elements of the second array");
		for(int i=0;i<s2;i++){
			 arrB[i]= sc.nextDouble();}
		System.out.println("The second array is");
		for(int i=0;i<s2;i++){
			System.out.println(arrB[i]);}
		
		int size=(s1>s2)?s1:s2;
		int sumarray[]= new int[size];
		if(size==s1){
			for(int k=0; k<s2;k++){
				 sumarray[k] = (int)(arrA[k]+arrB[k]);				
			}
			for(int k=s2; k<s1;k++){
				sumarray[k]= (int) arrA[k];
			}
		}
			else{
				for(int k=0; k<s1;k++){
					 sumarray[k] = (int)(arrA[k]+arrB[k]);				
				}
				for(int k=s1; k<s2;k++){
					sumarray[k]= (int) arrB[k];
				}
				
			}
		System.out.println("The final array is");
		for(int m=0; m<size;m++){
			System.out.println(sumarray[m]);
		}
		
	}

}
