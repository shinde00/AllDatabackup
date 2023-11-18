package practices;

import java.util.ArrayList;
import java.util.Arrays;

public class staircase {
	// Iterative linear solution
	  public static Integer countSteps(Integer n)
	  {

			 
				
				 if(n <= 0) return 0;
				    if(n == 1) return 1;
				    if(n == 2) return 2;
				    if(n == 3) return 4;

				    ArrayList<Integer> counts = new ArrayList<Integer>();
				    counts.add(0);
				    counts.add(1);
				    counts.add(2);
				    counts.add(4);
				    //(Arrays.asList(0, 1, 2, 4));
				    
				    for(int i = 4; i <= n; i++)
				    {
				      counts.add(counts.get(i - 1) + counts.get(i - 2) + counts.get(i - 3));
				    }

				    return counts.get(n);
					
			  }


			  public static boolean doTestsPass()
			  {
			    return countSteps(3) == 4
			      && countSteps(4) == 7
			    && countSteps(5) == 13;
			  }

			public static void main(String[] args) {
				// TODO Auto-generated method stub

				 if(doTestsPass())
				    {
				      System.out.println("All tests pass");
				    }
				    else
				    {
				      System.out.println("Tests fail.");
				    }
				 
				 for (Integer n = 1; n <= 10; n++)
				    {
				      Integer numberOfCombinations = countSteps(n);
				      System.out.println(n + " steps => " + numberOfCombinations);
				    }
			}

	  }
			
			
