package Week_one;

public class Recursion {

	static int arr[]= {6,2,4,14,23};
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int value = Sumofvalue(arr.length-1);
		System.out.println(value);
		int fact_value= factof(3);
		System.out.println(fact_value);
		int fab_value=fabonacci(9);
		System.out.println(fab_value);
	}
	private static int fabonacci(int n) {
		// TODO Auto-generated method stub
		if(n==0||n==1) {
			return n;
		}
		return fabonacci(n-1)+fabonacci(n-2);
	}
	private static int factof(int n) {
		// TODO Auto-generated method stub
		if(n==1)
			return 1;
		
		return n * factof(n-1);
	}
	private static int Sumofvalue(int n) {
		if (n==0)
			return arr[0];
		// TODO Auto-generated method stub
		
		return arr[n] + Sumofvalue(n-1);
	}

}
