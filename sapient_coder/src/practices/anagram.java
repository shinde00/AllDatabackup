package practices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class anagram {
	 
	  static List<List<String>> setOfAnagrams(String[] input){
		  List<List<String>> groupedAnagrams = new ArrayList<List<String>>();
	        HashMap<String, List<String>> b = new HashMap<String, List<String>>();
		//  Map<String,ArrayList<String>>b=new HashMap<>();
	       
//		  for(String s:input) {
//			 // System.out.println(s);
//			  char[] c=s.toCharArray();
//			  Arrays.sort(c);
//			  //System.out.println(c);
//			  String key=new String(c);
//			  System.out.println(key);
//			  b.computeIfAbsent(key, k-> new ArrayList<>()).add(s);
//			groupedAnagrams.addAll(b.values());
//		  }
//		  System.out.println(b.values());
//		  System.out.println(groupedAnagrams);
	        
	       for(String s:input) {
	        	char[] c=s.toCharArray();
	        	Arrays.sort(c);
	        	String sorted=String.valueOf(c);
	        	System.out.println(sorted);
	        	if(!b.containsKey(sorted)) {
	        		b.put(sorted, new ArrayList<>());
	        	}
	        	b.get(sorted).add(s);
	        }
	        System.out.println(b.values());
		return new ArrayList<>(b.values()) ;
	
	  }
	  
	
	  
	  @SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		  boolean result = true;
//		  String[] input={"cat", "dog", "tac", "god", "act"};
//		  String[] output={"[[cat, tac, act], [dog, god]]"};
//		 List<List<String>>actual = setOfAnagrams(input);
		// System.out.println(actual);
		  
	   result &=setOfAnagrams(new String[]{"cat", "dog", "tac", "god", "act"}).equals(new String[]{"[[cat, tac, act], [dog, god]]"});
	   if(result) {
		   
	   System.out.println("test pass");
	   
	   }else {System.out.println("test fail");
		   
	   }
	  }
}