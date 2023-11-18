package practices;

public class is_power_10 {

	  public static boolean isPowerOf10(int x)
	  {
	 for(int i=1;i<=x;i*=10) {
		 
	if(i==x) {
		return true;
	}
	//if(i>Integer.MAX_VALUE/10) {
	//	return false;
	//}
		 
	 }
		  
		  
		  

	  return false;
	  }

	  public static boolean doTestsPass()
	  {
	  int[] isPowerList = {10,100,1000};
	  int[] isNotPowerList = {3};

	  for(int i : isPowerList)
	  {
	    if(!isPowerOf10(i))
	    {
	    System.out.println("Test failed for: " + i);
	    return false;
	    }
	  }

	  for(int i : isNotPowerList)
	  {
	    if(isPowerOf10(i))
	    {
	    System.out.println("Test failed for: " + i);
	    return false;
	    }
	  }

	  System.out.println("All tested passed");
	  return true;
	  };


	  public static void main(String args[])
	  {
	  doTestsPass();
	  }
}
