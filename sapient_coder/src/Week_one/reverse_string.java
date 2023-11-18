package Week_one;

public class reverse_string {

	public static void main(String[] args) {
		String str= "PublicisSapient";
		String y="";
		for(int i=str.length()-1;i>=0;i--) {
			y=y+str.charAt(i);
		}
            System.out.println(y);
	}

}
