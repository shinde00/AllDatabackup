package practices;

public class two_sorted_arrays {
	  public static double findMedianSortedArrays(int[] A, int[] B) {
		double sum1=0;
		double sum2=0;
		double sum;
		double median;
		  for(int i=0;i<A.length;i++) {
			sum1=sum1+A[i]; 
			  
		  }
		  for(int i=0;i<B.length;i++) {
			  sum2=sum2+B[i];
		  }
		  sum=sum1+sum2;
		 // System.out.println(sum);
		  double length=A.length+B.length;
		  median=sum/length ;
		  
		  System.out.println(length);
		  
		  
		  
		  return median;
		 

		 
	  }
		  public static boolean doTestsPass()
		  {
		  boolean result = true;
		  result = result && findMedianSortedArrays(new int[]{1, 3}, new int[]{2, 4}) == 2.5;
		  result = result && findMedianSortedArrays(new int[]{1, 3}, new int[]{2}) == 2.0;
		  return result;
		  };


		  public static void main(String[] args)
		  {
		  if(doTestsPass())
		  {
		    System.out.println("All tests pass");
		  }
		  else
		  {
		    System.out.println("There are test failures");
		  }
		  }
}
