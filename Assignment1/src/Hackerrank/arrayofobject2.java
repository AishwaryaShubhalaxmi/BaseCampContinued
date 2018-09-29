package Hackerrank;
import java.util.*;
public class arrayofobject2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter the number");
      int n=sc.nextInt();
      Student[] std=new Student[n];
      for(int i=0;i<n;i++){
    	  std[i]=new Student();
      }
      System.out.println("Enter the name of the student");
      for(int i=0;i<n;i++){
    	  std[i].name=sc.next();
    	 }
     System.out.println("Enter the roll number");
     for(int i=0;i<n;i++){
	  std[i].rollno=sc.nextInt();
  }
  for(int i=0;i<n;i++){
	  System.out.println(std[i].name + " " + std[i].rollno);
  }
}
}
class Student{
	String name;
	int rollno;
}
