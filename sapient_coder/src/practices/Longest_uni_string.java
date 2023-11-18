package practices;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Longest_uni_string {
	 private static final Map<String, int[]> testCases = new HashMap<String, int[]>();

	  static int[] longestUniformSubstring(String input){
   if (input==null||input.length()==0) {
	     
	   return new int[] {-1,0};
   }
      int maxlen=1, count=1 ;
      int maxstartindex=0, maxcurlindex=0;
	    for(int i=1;i<input.length();i++) {
	    	if(input.charAt(i-1)==input.charAt(i)) {
	    		count++;
	    	}else {
	    		count=1;
	    		maxcurlindex=i;
	    	}
	    	
	    	if(count>maxlen) {
	    		maxlen=count;
	    		maxstartindex=maxcurlindex;
	    	}
	    }
	    
	    
	    return new int[]{ maxstartindex, maxlen };
	  }

	  public static void main(String[] args) {
	    testCases.put("", new int[]{-1, 0});
	    testCases.put("10000111", new int[]{1, 4});
	    testCases.put("aabbbbbCdAA", new int[]{2, 5});
	    testCases.put("100111111", new int[]{3, 6});
	    testCases.put("$$$$$bbbCdAA", new int[]{0, 5});

	    boolean pass = true;
	    for(Map.Entry<String,int[]> testCase : testCases.entrySet()){
	      int[] result = longestUniformSubstring(testCase.getKey());
	      pass = pass && (Arrays.equals(result, testCase.getValue()));
	    }
	    if(pass){
	      System.out.println("Pass!");
	    } else {
	      System.out.println("Failed! ");
	    }
	  }
}
