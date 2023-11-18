package practices;

public class count_length_cycle {
	 /**
	   *
	   * You have an integer array.
	   * Starting from arr[startIndex], follow each element to the index it points to. 
	   * Continue to do this until you find a cycle. 
	   * Return the length of the cycle. If no cycle is found return -1
	   *
	  */
	  public static int countLengthOfCycle( int[] arr, int startIndex ) {
		if(arr.length<1) {
			
			 return -1;	
		}
	  for(int i=0;i<arr.length;i++) {
		 int length=arr.length; 
		  
	  }
	  return arr.length;
	  }


	  public static void main( String[] args ) {

	 boolean testsPassed = true;
	  
	  testsPassed &= countLengthOfCycle(new int[]{1, 0}, 0) == 2;
	  testsPassed &= countLengthOfCycle(new int[]{1, 2, 0}, 0) == 3;
	  testsPassed &= countLengthOfCycle(new int[]{1, 2,4,5, 0}, 0) == 5;
	  
	  if(testsPassed) {
	    System.out.println( "Test passed." );
	    //return true;
	  } else {
	    System.out.println( "Test failed." );
	    //return false;
	  }
}}
