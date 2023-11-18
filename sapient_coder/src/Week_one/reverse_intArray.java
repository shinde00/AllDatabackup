package Week_one;

public class reverse_intArray {

	public static void main(String[] args) {
		int [] arr = {10, 20, 30, 40, 50};
		
		  String b="";
		for(int i=arr.length-1;i>=0;i--) {
			
			b=b+" "+arr[i];
		}
		
		System.out.println(b);
	}

}
