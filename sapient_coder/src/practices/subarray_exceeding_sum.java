package practices;

public class subarray_exceeding_sum {
	 public static int subArrayExceedsSum(int arr[], int target )
	  {
	  int i = 0, j = 0, length = Integer.MAX_VALUE, size = arr.length;
	  
	  if( target <= 0 )
	    return 0;
	  
	  if( size < 1 )
	    return -1;
	  
	  int sum = arr[ 0 ];
	  while( true )
	  {
	    if( sum >= target )
	    if( i == j )
	      return( 1 );
	    else
	    {
	      if( j - i + 1 < length )
	      length = j - i + 1;
	      sum -= arr[ i ];
	      i++;
	    }
	    else
	    {
	    j++;
	    if( j == size )
	      break;
	    else
	      sum += arr[ j ];
	    };
	  };

	  if( length == Integer.MAX_VALUE )
	    return -1;

	  return length;
	  }
	 public static void doTestsPass()
	  {
	  boolean result = true; 
	  int[] arr = { 1, 2, 3, 4 };
	  result = result && subArrayExceedsSum( arr, 6 ) == 2;
	  result = result && subArrayExceedsSum( arr, 12 ) == -1;
	  result = result && subArrayExceedsSum( arr, 10 ) == 4;
	  result = result && subArrayExceedsSum( arr, 4 ) == 1;
	  result = result && subArrayExceedsSum( arr, 7 ) == 2;
	  result = result && subArrayExceedsSum( arr, 8 ) == 3;

	  int[] arr2 = {};
	  result = result && subArrayExceedsSum( arr2, 0 ) == 0;
	  result = result && subArrayExceedsSum( arr2, 2 ) == -1;
	  
	  if( result )
	  {
	    System.out.println("All tests pass\n");
	  }
	  else
	  {
	    System.out.println("There are test failures\n");
	  }
	  };

	  public static void main(String[] args)
	  {
	  doTestsPass();
	  }
}
