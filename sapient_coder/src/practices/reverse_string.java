package practices;

public class reverse_string {

	 /**
	   * public static String reverseStr( String str )
	   * Example: reverseStr(str) where str is "abcd" returns "dcba".
	   */
	  public static String reverseStr( String str ){
	    
		  StringBuilder s=new StringBuilder(str);
		  
		 // System.out.println(s.reverse());
		  
	    return s.reverse().toString();
	  }

	  
	  public static void main(String[] args){
	  
	  String testString;
	    String solution;
	    boolean result = true;

	    result = result && reverseStr("abcd").equals("dcba");
	  
	  if(result){
	    System.out.println("All tests pass");
	  }
	  else{
	    System.out.println("There are test failures");
	  }

	   }
}
