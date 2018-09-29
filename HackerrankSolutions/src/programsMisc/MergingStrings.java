package programsMisc;
import java.util.*;
public class MergingStrings {
	public static String merge(String a, String b){
		 String mergestr = "";

			int size = (a.length() < b.length()) ? a.length() : b.length();

			for (int i = 0; i < size; i++) {
				mergestr += a.charAt(i);
				for (int j = i; j < i + 1; j++) {
					mergestr += b.charAt(j);
				}
			}
	       if (a.length() > b.length()) {
				for (int i = size; i < a.length(); i++) {
					mergestr += a.charAt(i);

				}
			}

			if (b.length() > a.length()) {
				for (int i = size; i < b.length(); i++) {
					mergestr += b.charAt(i);
				}
			}
				
			 System.out.println(mergestr);
			 return mergestr;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      /*   String s1="aishwarya";
         String s2=" is my name";
         System.out.println(s1 + s2);  Merging two strings is same as concatenating */
	  Scanner sc= new Scanner(System.in);
	  System.out.println("Enter the first string");
	  String s1=sc.nextLine();
	  System.out.println("Enter the second string");
	  String s2=sc.nextLine();
	 // System.out.println(s1);
	  //System.out.println(s2);
	  merge(s1, s2);
	 // System.out.println(res);
      
	
	
	}

}
