package Week_one;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class screening_practice {

	public static void main(String[] args) {
		
		int a=110234;

		//String b= Integer.toString(a);
		String b= String.valueOf(a);
		String y="";
		for(int i=b.length()-1;i>=0;i--){
		  
		  y=y+b.charAt(i);
		}
		System.out.println(y);
		}	
		
			  
}

