package Java_programms;

import java.lang.reflect.Array;

public class sum_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] a= {2,4,5,6};
		int sum=0;
		for(int i=0 ;i<a.length;i++) {
			
		sum = sum+a[i];	
		}
		System.out.println(sum);
	}

}
