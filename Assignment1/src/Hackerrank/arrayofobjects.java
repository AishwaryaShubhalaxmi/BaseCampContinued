package Hackerrank;
import java.util.*;
class Students{
	String name;
	int rollnumber;
	public Students(String s,int r){
		name=s;
		rollnumber=r;
		}
	}
public class arrayofobjects {
	
public static void main(String[] args){

Scanner sc=new Scanner(System.in);

Students std[]=new Students[3];
/* for(int i=0;i<3;i++){
	std[i]=new Students() ;
}  */ 

	/* std[0].name="Aishwarya";
	std[1].name="Shivani";
	std[2].name="Naina";
	std[0].rollnumber=" 56";
	std[1].rollnumber=" 58";
	std[2].rollnumber=" 59"; */ 
 


System.out.println(std[0].name + std[0].rollnumber);
System.out.println(std[1].name + std[1].rollnumber);
System.out.println(std[2].name + std[2].rollnumber);


	
}
}


