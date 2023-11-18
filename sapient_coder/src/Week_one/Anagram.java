package Week_one;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
	  // TODO Auto-generated method stub
      String in="silent,cat,dog";
      String op="listen,tac,god";
      
      char a[]=in.toCharArray();
      char b[]=op.toCharArray();
    
      Arrays.sort(a);
      Arrays.sort(b);    
	
      boolean result= Arrays.equals(a,b);		
	  if(result==true) {
	  System.out.println("given string is anagram");
	  }else {
	  System.out.println("given string is not anagram");
	  }
	  }
	  }
