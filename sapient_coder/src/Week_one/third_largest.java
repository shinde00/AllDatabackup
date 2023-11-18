package Week_one;

public class third_largest {

	public static void main(String[] args) {
		int a[]={20,18,5,17,3,2};
 int first=Integer.MAX_VALUE;
 int second=Integer.MAX_VALUE;
 int third=Integer.MAX_VALUE;
 //System.out.println(first);
  for(int i=0; i<a.length;i++) {
	  
	  if(a[i]<first) {
	  third=second;
	  second=first;
	  first=a[i];
	  }else if (a[i]<second&& a[i]!=first){
		  third=second;
		  second=a[i];
	  }
	  else if(a[i]< third &&a[i]!=second&&a[i]!=first) {
		  third=a[i];
	  } 
  }
		System.out.println(third);
	}

}
