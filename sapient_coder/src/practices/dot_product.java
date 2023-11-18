package practices;

public class dot_product {
	 /**
	   *
	   * Given two arrays of integers, returns the dot product of the arrays
	   */

	  public static int dotProduct( int[] array1, int[] array2 ) {
	   
		  int sum=0;
		  int sum1=0;
		  int sum2=0;
		  for(int i=0;i<array1.length;i++) {
			  sum1+=array1[i];
					  sum2 +=array2[i];
				sum=sum1+sum2;	  
		  }
	    return sum;
	  }
	 
	  public static void main( String[] args ) {
	   int[] array1 = { 1, 2 };
	    int[] array2 = { 2, 3 };
	    int result = dotProduct( array1, array2 );

	    if( result == 8 ) {
	      System.out.println( "Passed." );
	    //  return true;
	    } else {
	      System.out.println( "Failed." );
	    //  return false;
	    }
	  }
}
