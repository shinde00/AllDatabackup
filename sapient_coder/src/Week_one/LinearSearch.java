package Week_one;

public class LinearSearch {

	public static void main(String[] args) {
		
   int arr[]= {3,5,6,8,9,13};
   System.out.println(linearserach(arr, 13));
   System.out.println(binarysearch(arr, 13));
   System.out.println(recursionbinarysearch(arr, 13, 0, arr.length-1));
	}

	// time complexity O(n)
	public static int linearserach(int arr[],int target) {
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]==target)
				return i;
		}
		
		return -1;
		
	}
	// time complexity O(logn)

	public static int binarysearch(int arr[],int target) {
		int middle;
		int left=0;
		int right=arr.length-1;

		while(left<=right) {
			middle =(left+right)/2;
			if(arr[middle]==target)
				return middle;
			if(target<arr[middle]) {
				right=middle-1;	
			}else {
				left=middle+1;	
			}
		}
		
		return -1;
		
	}
	
	// time complexity O(logn)

	
	public static int recursionbinarysearch(int arr[], int target, int left ,int right) {
		
		if(left>right)
			return -1;
		int middle=(left+right)/2;
		if(arr[middle]==target)
			return middle;
		
		
		if(target<arr[middle]) {
			right=middle-1;
		return recursionbinarysearch(arr, target, left, right);
		} else {
			left=middle+1;
			return recursionbinarysearch(arr, target, left, right);
		}
		
	}

}
