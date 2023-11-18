package practices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

public class group_anagram {

	  static String input = "cat dog tac sat tas god dog";
	  
	  static void setOfAnagrams(String[] input){ 
	    
	   Map<String,List<String>>hm=new HashMap<>();
	   SortedSet<String> xt=new TreeSet<>();
	   
		  for(String y:input) {
			  char[] c=y.toCharArray();
			  Arrays.sort(c);
			  String key=new String(c);
			  hm.computeIfAbsent(key, k-> new ArrayList<>());
			  hm.put(key, hm.get(key)).add(y);
		  }
	   // System.out.println(hm.values());
		System.out.println(hm.values().toString());  
		  
	    
	  }
	  
	  
	  public static void main(String[] args) {
	    
	    String[] input = {"cat","dog","tac","sat","tas","god","dog"};
	    setOfAnagrams(input);
	    
	  }
}
