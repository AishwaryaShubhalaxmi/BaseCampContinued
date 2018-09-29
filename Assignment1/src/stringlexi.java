import java.util.*;
public class stringlexi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s= sc.next();
		String a="";
	    String b="";
		char ch;
		
		for(int i=0; i<s.length();i++){
			ch=s.charAt(i);
			if(Character.isAlphabetic(ch)){
				a+=ch;
			}
		}
		
		System.out.println(a);
		for(char i='a';i<='z';i++){
			for(int j=0;j<a.length();j++){
				char t=a.charAt(j);
				if(i==(t+32)||i==(t)){
					b+=a;
				}
			}
			
		}
      System.out.println(b);
	}

}
