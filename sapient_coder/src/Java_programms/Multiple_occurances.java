package Java_programms;

import java.util.HashMap;
import java.util.Map.Entry;

public class Multiple_occurances {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Character , Integer> hm = new HashMap<Character,Integer>();
		String x = "publicissapientnoidaaaaaaa";
		for (int i = 0 ;i<x.length();i++) {
			if(hm.containsKey(x.charAt(i))) {
				int count = hm.get(x.charAt(i)) + 1;
				hm.put(x.charAt(i), count);
			}else {
				hm.put(x.charAt(i), 1);
			}
		}
		char maxkey =' ';
		int maxval=0;
		
		for(Entry<Character, Integer> y : hm.entrySet()) {
			 maxkey=y.getKey();
			 maxval=y.getValue();
			if(maxval>1) {
				
				 System.out.println(maxkey+ " " + maxval);
			}
		}
	}

}
