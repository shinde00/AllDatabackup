package Java_programms;

public class Reverse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "my space class";
		String a[]= s.split(" ");
		String y="";
		for(int j=0;j<a.length;j++) {
			
		for(int i=a[j].length()-1;i>=0;i--) {
			
			y=y+a[j].charAt(i);
		}
		y=y+" ";
		}
		System.out.println(y+" ");
		
	}

}
