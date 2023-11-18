package Java_programms;

import java.util.HashMap;
import java.util.Map.Entry;

public class fabbonacci_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*int a= 0;
		int b= 1;
		int c=0;
		
		for(int i=0;i<10;i++) {
		
			c=a+b;
			a=b;
			b=c;
			
			System.out.println(c);
		}*/
		
		String pri= "amandananda";
		String y=" ";
		HashMap<Character, Integer> hm= new HashMap<Character, Integer>();
		
		for(int i=0;i<pri.length();i++) {
			
			if(hm.containsKey(pri.charAt(i))) {
				
				int count = hm.get(pri.charAt(i))+1;
				
				 hm.put(pri.charAt(i), count);
				
			}else {
				
				 hm.put(pri.charAt(i), 1);
			}
		
		}
		
		for(Entry<Character,Integer> t : hm.entrySet()) {
			
			System.out.println(t.getKey()+" "+t.getValue());
		}
		
	}

}
