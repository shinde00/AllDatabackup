package Week_one;

import java.util.HashMap;
import java.util.Map.Entry;

class test2 {

	
	
	
	public void vehicle() {
		
		System.out.println("this is parent car");
	}
	//race care
	
}

 public class test1 extends test2 {
	
	
	 
	 public void hashmapvalues() {
		 HashMap <String,Integer>hm= new HashMap<String,Integer>();
		 
		 hm.put("Harish", 1000);
		 hm.put("Shailendra", 20000);
		 hm.put("rushikesh", 10000);
		 hm.put("sasikumar", 20000);
		 
		 for(Entry<String,Integer>y:hm.entrySet()) {
			 
			 System.out.println(y.getKey()+" "+y.getValue());
		 }
	 }
	
	public void vehicle() {
		System.out.println("this is child car");
	}
	
	
	

	public static void main(String[] args) {
		
	test1 c= new test1();/// upcasting
	
	 c.vehicle();
	
	c.hashmapvalues();
		

	}

	
	
	
	
	
	
}
