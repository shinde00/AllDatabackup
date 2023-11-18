package Week_one;

import java.util.ArrayList;
import java.util.List;

public class Search_number_from_Array {

	public static void main(String[] args) {
		
		int array[]= {2,12,6,10,9,32};
		
		int searchnum=12;
		
		boolean flag= false;
		
		for(int i=0;i<array.length;i++) {
			
		if(array[i]==searchnum) {
			
			flag=true;
			
		 System.out.println("your search number at array of index"+" "+i);	
		}
		
		}
			
        if(flag==false) {
			
		System.out.println("your search number is not present in arrray");	
			
		}
		
      //// using collection
        
        List<Integer> list= new ArrayList<>();
        for(int j=0;j<array.length;j++) {
        	list.add(array[j]);
//        	System.out.println(list);
//        	System.out.println(searchnum);
        	
        }
        
       for(int c=0;c<list.size();c++) {
    	   
    	   if(list.get(c)==searchnum) {
    		      flag=true;
    		   System.out.println("your num is present at index "+c);
    	   }
       }
       if(flag==false){
    		   
    		   System.out.println("invalid number");
    	   }
       }
        
		
		
	}


