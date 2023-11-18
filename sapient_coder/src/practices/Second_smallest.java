package practices;

public class Second_smallest {
	/**
	 * int secondSmallest(int[] x)
	 */
	public static int secondSmallest(int[] x) {
		// Your code
		if(x.length<2) {
			
			return 0;
		}
		int smallest=Integer.MAX_VALUE;
		int secondsmallest=Integer.MAX_VALUE;
		for(int i=0;i<x.length;i++) {
			if(x[i]<smallest) {
				secondsmallest=smallest;
				smallest=x[i];
			}else if(x[i]<secondsmallest) {
				secondsmallest=x[i];
			}
		}
		return secondsmallest;
		
	}

	public static void main(String args[]) {

		int[] a = { 0 };
		int[] b = { 0, 1 };
		int[] c = { 0 ,5,3,4};
		int[] e = { 0, 1,8,2,6 };
		int[] f = { 0 };
		int[] g = { 0, 1,4,6,6 };
		boolean result = true;
		result &= secondSmallest(a) == 0;
		result &= secondSmallest(b) == 1;
		result &= secondSmallest(c) == 3;
		result &= secondSmallest(e) == 1;
		result &= secondSmallest(f) == 0;
		result &= secondSmallest(g) == 1;

		if (result) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}

	}
}
