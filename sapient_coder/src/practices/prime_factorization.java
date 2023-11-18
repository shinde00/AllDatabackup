package practices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class prime_factorization {


	/**
	   * Return an array containing prime numbers whose product is x
	   * Examples:
	   * primeFactorization( 6 ) == [2,3]
	   * primeFactorization( 5 ) == [5]
	   */
  public static ArrayList<Integer> primeFactorization(int x)
  {
	 ArrayList<Integer> fact=new ArrayList<>();
	  if(x<2) {
		 return fact;
	 }
	  
	  for(int i=2;i<=x;i++) {
		 if(x%i==0) {
			 x=x/i;
				  
		fact.add(i); 
		  }
	  }
	return fact;
	  
  
  }

public static void main(String args[])
  {
	
	System.out.println(primeFactorization(6) + " " + primeFactorization(5)); 
	if(primeFactorization(6).equals(Arrays.asList(2,3)) 
			&& 
			primeFactorization(5).equals(Arrays.asList(5))
			) {
		System.out.println("All passed");
	}else {
		System.out.println("Failed");
	}
  
  }
}
