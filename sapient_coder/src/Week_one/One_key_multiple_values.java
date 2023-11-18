package Week_one;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class One_key_multiple_values {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String,List<String>>hm=new HashMap<>();
		String key="subject";
		
		ArrayList<String>list=new ArrayList<>();
		list.add("mathematics");
		list.add("science");
		list.add("marathi");
		list.add("biology");
		
		hm.put(key, list);
	
		// to fetching retrieved values
		
		List<String>retrievedvalues=hm.get(key);
		
		
		//print values 1 by 1
		 for(String s:retrievedvalues) {
			 
			 System.out.println(s);
		 }
		
		
	}

}
