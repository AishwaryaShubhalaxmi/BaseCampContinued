
public class arraysort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a[]= {1,15,7,9,3};
       for(int i=0;i<5;i++){
    	   for(int j=0;j<5-i-1;j++){
    		   if(a[j]>a[j+1])
    		   {
    			  int c= a[j];
    			  a[j]=a[j+1];
                   a[j+1]=c;
                   }
    	   }
       }
    for(int i=0;i<5;i++){
    	System.out.println(a[i]);}
    }
    	
	}


