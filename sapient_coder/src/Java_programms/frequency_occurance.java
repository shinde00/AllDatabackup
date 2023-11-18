package Java_programms;

import java.util.HashMap;
import java.util.Map.Entry;

public class frequency_occurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Character , Integer> hm = new HashMap<Character,Integer>();
		String x = "ppppmyspaceclass";
		for (int i = 0 ;i<x.length();i++) {
			if(hm.containsKey(x.charAt(i))) {
				int count = hm.get(x.charAt(i)) + 1;
				hm.put(x.charAt(i), count);
			}else {
				hm.put(x.charAt(i), 1);
			}
		}
		
		for(Entry<Character, Integer> y : hm.entrySet()) {
			System.out.println(y.getKey() + " " + y.getValue());
		}
	}

}
