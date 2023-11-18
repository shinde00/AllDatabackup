package Java_programms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class sorting {
 public static void main(String[] args) {
	
	 int a[]= {1,6,26,91,5,11,33};
	 
//	 Arrays.sort(a);
//	 for(int a1 : a) {
//		  System.out.println(a1);
	// }
	 for(int i=0;i<a.length;i++) {
		
		 int min=0;
	for(int j=i+1;j<a.length;j++) {
		
	if(	a[j] < a[i]) {
		min=a[i];
		a[i]=a[j];
		a[j]=min;
//		a[i]=a[i]+a[j];
//		a[j]=a[i]-a[j];
//		a[i]=a[i]-a[j];
		
	}		
		
	}
	 System.out.println(a[i]);
//		 
 }
//	
//	 ArrayList<Integer>hm = new ArrayList<Integer>();
//	 ArrayList<Object>mm = new ArrayList<Object>();
//	 for(int i=0;i<a.length;i++) {
//	 
//	 hm.add(a[i]);
//	 //System.out.println(hm);
//	// hm.clear();
//	// Collections.sort(hm);
//	Arrays.sort;
	// }
	// mm.addAll(hm);
	 
	 
}
}
