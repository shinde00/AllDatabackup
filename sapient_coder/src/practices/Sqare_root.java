package practices;

public class Sqare_root {

	  public static double squareRoot( double x )
	  {
		double y=Math.sqrt(x);  
		  
		  
	    return y;
	  }

	  public static void main( String args[])
	  {
	    double[] inputs = {2, 4, 100};
	    double[] expected_values = { 1.41421, 2, 10 };
	    double threshold = 0.001;
	    for(int i=0; i < inputs.length; i++)
	    {
	      if( Math.abs(squareRoot(inputs[i])-expected_values[i])>threshold )
	      {
	        System.out.printf( "Test failed for %f, expected=%f, actual=%f\n", inputs[i], expected_values[i], squareRoot(inputs[i]) );
	      }
	    }
	    System.out.println( "All tests passed");
	  }
}
