package practices;

import java.util.HashMap;
import java.util.Map;

public class run_lengthencoding {
	 public static String rle(String input) {
		   if(input.length()<1) {
			   return "";
		   }
		   HashMap<Character,Integer> hm= new HashMap<>();
		   for(int i=0;i<input.length();i++) {
			   if(hm.containsKey(input.charAt(i))){
				 
				   int count= hm.get(input.charAt(i))+1;
				   hm.put(input.charAt(i), count);
				   
			   }else {
				   hm.put(input.charAt(i),1);
			   }
		   }
		   for(Map.Entry<Character, Integer> y: hm.entrySet()) {
			System.out.println((y.getKey()+""+y.getValue()));
		   }
		 return hm.toString();
		  }


		 public static void main(String[] args)  {
		    
			  if("".equals(rle("")) && 
					  "a".equals(rle("a")) && 
					  "a3".equals(rle("aaa"))){
				  System.out.println("Passed");
			  }else {
				  System.out.println("Failed");
			  }
		  }
}
