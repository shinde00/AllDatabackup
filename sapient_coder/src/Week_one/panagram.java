package Week_one;

public class panagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String input="THE QUICK BROWN FOX JUMPS OVER A LAZY DOG";
	input=input.replace(" ", "");
	
	char y[]=input.toCharArray();
	//input.split(" ");
	int size=y.length;
	//System.out.println(size);
	int a[]= {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		
		
	for(int i=0;i<y.length;i++) {
		
		int index= y[i]-65;
		a[index]=1;
	}
	
		for(int i=0;i<26;i++) {
			
			if(a[i]==1) {
				
			}else {
				System.out.println("string is not panagram");
				System.exit(0);
			}
		}
		System.out.println("string is panagram");
		
		
	}

}
