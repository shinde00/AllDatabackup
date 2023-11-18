package Week_one;

import java.util.ArrayList;

public class Remove_duplicate_int_array {

	public static void main(String[] args) {
		
		int a[]= {3,6,3,2,8,10,6,2};
		
		ArrayList<Integer>list=new ArrayList<Integer>();
		
		for(int i=0;i<a.length;i++) {
			if(! list.contains(a[i])) {
				
				list.add(a[i]);
			}
			
		}
		System.out.println(list);
		
		//Conversion Arraylist to array
		int b[]= new int[list.size()];
		  for(int i=0; i < list.size(); i++) {
	          b[i] = list.get(i);
	      }
		
		// for each loop to print array value
		for(int y:b) {
			System.out.print(y+ " ");
		}
	 
	}

}
