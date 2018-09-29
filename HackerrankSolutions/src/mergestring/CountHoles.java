package mergestring;
import java.util.*;

public class CountHoles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int r,sum=0;
		while(num !=0){
		r=num%10;
		if(r==1 || r==2 || r==3 || r==5 || r==7){
			sum+=0;
		}
		else if(r==0 || r==4 || r==6 || r==9){
			sum+=1;
		}
		else{
			sum+=2;
		}
		
       num=num/10;
       }
		
       System.out.println(sum);
	}

}
