package practices;

public class dictionary_1 {

	public static void main(String[] args) {
		
		

		    String a = "naman", reverseStr = "";
		    
		    int strLength = a.length();

		    for (int i = (strLength - 1); i >=0; --i) {
		      reverseStr = reverseStr + a.charAt(i);
		    }

		    if (a.toLowerCase().equals(reverseStr.toLowerCase())) {
		      System.out.println(a + " is a Palindrome String.");
		    }
		    else {
		      System.out.println(a + " is not a Palindrome String.");
		    }
		  }
	}

