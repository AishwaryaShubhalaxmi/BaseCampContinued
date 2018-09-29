package mergestring;
import java.util.*;
class Employee{
	String name;
	int mid;
	double salary;
}
public class Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int c=0,pos=0;
	    Employee[] emp= new Employee[6];   //creates reference for 6 objects
	     for(int i=0;i<6;i++){
    	   emp[i]=new Employee();         //creates objects
       }
       System.out.println("Enter the names of the employees ");
       for(int i=0;i<6;i++){
    	   emp[i].name=sc.next();
       }
       System.out.println("Enter the ids");
       for(int i=0;i<6;i++){
    	   emp[i].mid=sc.nextInt();
    	   
       }
       System.out.println("Enter the salary");
       for(int i=0;i<6;i++){
    	   emp[i].salary=sc.nextDouble();
       }
       System.out.println("The name of 5th employee is : " + emp[4].name);
       System.out.println("The name and mid of 4th employee are: " +emp[3].name + " and " + emp[3].mid);
       System.out.println("Enter the mid to be searched");    //search the element using linear search
         int id=sc.nextInt();
        for(int i=0;i<6;i++){
			if(emp[i].mid==id){
			c=1;
		    pos=i+1;
				}
			}
           if(c==0)
			System.out.println("mid not found");
			else 
			System.out.println("the mid is found at position " + pos + " and is of employee " + emp[pos-1].name);
		 
             // sort the array using bubble sort
           for(int i=0;i<6;i++){     
           	for(int j=i+1;j<6;j++){
           	if(emp[i].salary< emp[j].salary){
           	Employee temp= emp[i];
           	 emp[i]=emp[j];
           		emp[j]=temp;
           	}
           } 
           }
           System.out.println("The names of employees in descending order of their salary are: ");
           for(int i=0;i<6;i++){
           System.out.println(emp[i].name + " " + emp[i].salary);}
       
	}
}


