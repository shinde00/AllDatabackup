package Week_one;

import java.util.HashMap;
import java.util.Map.Entry;

public class duplicate_char {

	
	public static boolean duplicate_char1(String input) {
		
		HashMap<Character,Integer>hm=new HashMap<Character,Integer>();
		
		for(int i=0;i<input.length();i++) {
			
			if(hm.containsKey(input.charAt(i))) {			
//				int count=hm.get(input.charAt(i))+1;
//				hm.put(input.charAt(i), count);
				return true;
			}
				
				hm.put(input.charAt(i), 1);
			
			
		}
		return false;	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "publicissapient";
		String str2 = "abcdefghijk";

		
//		boolean result = duplicate_char1(str1);
//	            result&= duplicate_char1(str2);

        if (duplicate_char1(str1)) {
            System.out.println("The string str1 has duplicate characters.");
        } else {
            System.out.println("The string str1 does not have duplicate characters.");
        }
        if (duplicate_char1(str2)) {
            System.out.println("The string str2  has duplicate characters.");
        } else {
            System.out.println("The string str2 does not have duplicate characters.");
        }
	}

}
