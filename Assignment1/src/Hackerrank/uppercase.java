package Hackerrank;
import java.util.*;
public class uppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String s="Aishwarya";
    char[] ch= s.toCharArray();
    for(int i=0;i<ch.length;i++){
    	if((ch[i]>=97) && (ch[i]<=122)){
    		ch[i]-=32;
    		
    	}
    	System.out.println(ch[i]);
    }
	}

}
