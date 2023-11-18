package Java_programms;

import java.util.HashMap;
import java.util.Map.Entry;

public class java_practicespro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String str ="publicissapient";
 
 HashMap <Character,Integer> hm = new HashMap<Character, Integer>();
 
 for(int i=0; i<str.length();i++) {
	 
	 if(hm.containsKey(str.charAt(i))) {
		 
		    int count = hm.get(str.charAt(i))+1;
		   
		    hm.put(str.charAt(i), count);
		    
	 }
	 else {
		 hm.put(str.charAt(i), 1);
	 }
 }
	
 for(Entry<Character, Integer> y : hm.entrySet()) {
	
	 System.out.println(y.getKey()+" "+y.getValue());
 }
		
	}

}
