package Week_one;

import java.util.HashMap;
import java.util.Map.Entry;

public class First_non_repeating_char {

	public static void main(String[] args) {
		
	int a[]= {1,2,3,2,1,1,8};
	HashMap <Integer , Integer>hm=new HashMap<Integer,Integer>();
	  
	for(int i=0;i<a.length;i++) {
		
		if(hm.containsKey(a[i])) {
			int count= hm.get(a[i])+1;
			hm.put(a[i], count);
		}
		else {
			hm.put(a[i],1);
		}
		
	}
	for(int i=0;i<a.length;i++) {
		if(hm.get(a[i])==1) {
			System.out.println(a[i]);
			//System.exit(0);
			break;
		}
	}
	
//	for(Entry<Integer,Integer>y:hm.entrySet()) {
//		if(y.getValue()==1) {
//			System.out.println(y.getKey());
//			System.exit(0);
//		}
//		//System.out.println(y.getKey()+" "+y.getValue());
//	}
//	
	
	}

}
