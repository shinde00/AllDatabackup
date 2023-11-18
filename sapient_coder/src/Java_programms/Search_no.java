package Java_programms;

public class Search_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {3,5,3,1,9};
		int searchNum = 9;
		boolean bflag = false;
		
		for(int i = 0; i<a.length;i++) {
			if(a[i]== searchNum) {
				bflag = true;
				System.out.println("Number is found at location"+i);
			}
		}
		if(bflag== false) {
			System.out.println("Number is not found");
		}		
	}

}
