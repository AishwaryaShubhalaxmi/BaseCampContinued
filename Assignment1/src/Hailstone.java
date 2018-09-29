import java.util.*;
public class Hailstone {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	int m;
	int count=0;
		System.out.println("enter the number" );
		int n= sc.nextInt();
		
		while(n!=1)
		{
			if(n%2==0)
				{
				m=n;
				n=n/2;
				System.out.println(m + "is even so i take half:" + n);}
				
		else{
			m=n;
			 n= 3*n+1;
			System.out.println(m + "is odd so i make 3n+1:" + n);
		}
	count++;
	}
		System.out.println("There are total " + count + " steps to reach 1");

}
}
