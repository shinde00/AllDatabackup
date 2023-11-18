package practices;

public class optimalpath {
	public static Integer optimalPath(Integer[][] grid)
	  {
	  if(grid.length == 0 || grid[0].length == 0)
	  {
	    return 0;
	  }
	  
	  for(Integer row = grid.length-1; row >= 0; row--)
	  {
	    for(Integer col = 0; col < grid[0].length; col++)
	    {
	    if(row < grid.length-1 && col > 0)
	      grid[row][col] += Math.max(grid[row+1][col], grid[row][col-1]);
	    else if(row < grid.length-1)
	      grid[row][col] += grid[row+1][col];
	    else if(col > 0)
	      grid[row][col] += grid[row][col-1];
	    }
	  }
	  Integer result = grid[0][grid[0].length-1];
	  System.out.println(result);
	  return result;
	  }

	  public static boolean doTestsPass()
	  {
	  boolean result = true;
	  // Base test case
	  result &= optimalPath(new Integer[][]{{0,0,0,0,5},
	                      {0,1,1,1,0},
	                      {2,0,0,0,0}}) == 10;
	  result &= optimalPath(new Integer[][]{{3,2,0,0,5},
                                            {1,1,0,1,0},
                                            {2,0,0,0,0}}) == 13;
	  
	  return result;
	  }

	  public static void main(String[] args)
	  {
	  if(doTestsPass())
	  {
	    System.out.println("All tests pass");
	  }
	  else
	  {
	    System.out.println("Tests fail.");
	  }
	  }
}
