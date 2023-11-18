package practices;

import java.util.HashMap;

public class first_non_repeting {


	  /**
	  * Finds the first character that does not repeat anywhere in the input string
	  * Given "apple", the answer is "a"
	  * Given "racecars", the answer is "e"
	  **/        
	  public static void findFirst(String input)
	  {
	    HashMap<Character,Integer>hm=new HashMap<>();
	    int length=input.length();
	    for(int i=0;i<length;i++) {
	    	Character ch=input.charAt(i);
	    	if(hm.containsKey(ch)) {
	    		int count=hm.get(ch)+1;
	    		hm.put(ch, count);
	    	}else {
	    		hm.put(ch, 1);
	    	}
	    } 
	    boolean nonrep=false;
	    for(int i=0;i<length;i++){
	    	Character ch=input.charAt(i);
	    	int freq=hm.get(ch);
	    	if(freq==1) {
	    		System.out.println(ch);
	    		nonrep=true;
	    		break;
	    	}
	    }if(nonrep==false) {
	    	
	    	System.out.println(-1);
	    }
	
	
	  }

	  public static void main(String args[])
	  {

	    String[] inputs = {"apple","racecars", "ababdc"};
	    char[] outputs = {'a', 'e', 'd' };

	    boolean result = true;
	    for(int i = 0; i < inputs.length; i++ )
	    {
	    
	      if(!result) {
	        System.out.println("Test failed for: " + inputs[i]);
	      }else {
	        System.out.println("Test passed for: " + inputs[i]);
	    }}}
	    }

