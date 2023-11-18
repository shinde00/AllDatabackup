package practices;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class pascal_triangle {

	  public static Map<Integer, Map<Integer, Integer>> hm 
	  = new HashMap<Integer,Map<Integer,Integer>>();

	  public static  int pascal(int col, int row){
	    if(col == 0 || col == row) {
	      return 1;
	    }
	    int Value = 0;
	    if(hm.containsKey(col)){
	      if(hm.get(col).containsKey(row)){
	        return hm.get(col).get(row);
	      }
	      else{
	        Value = pascal(col, row - 1) + pascal(col - 1, row - 1);
	        hm.get(col).put(row,Value);
	      }
	    }
	    else{
	      Value = pascal(col, row - 1) + pascal(col - 1, row - 1);
	      Map<Integer, Integer> rowHashMap = new HashMap();
	      rowHashMap.put(row,Value);
	      hm.put(col,rowHashMap);
	    }
	    return Value;
	  }

	  public static void main(String[] args) {
		  if(pascal(0,0) ==  1 &&
				  pascal(1,2) ==  2 &&
				  pascal(5,6) ==  6 &&
				  pascal(4,8) ==  70 &&
				  pascal(6,6) ==  1) {
			  System.out.println("Pass");		  
		  }else {
			  System.out.println("Failed");
		  }
	  }
}
