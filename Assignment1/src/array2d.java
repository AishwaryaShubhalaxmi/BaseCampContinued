import java.util.*;
public class array2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int r= sc.nextInt();
		System.out.println("Enter the number of columns");
		int c= sc.nextInt();
		int arr[][]= new int[r][c];
		System.out.println("Enter the array elements");
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				arr[i][j]= sc.nextInt();}
			}
		for(int i=0;i<c;i++){
			for(int j=0;j<r;j++){
				System.out.print(arr[j][i] + " ");
                }
			
		System.out.println("\n");}

	}

}
