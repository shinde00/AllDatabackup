package Java_programms;

public class print_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x= "my space234 class23";
		String y=" ";
		for(int i = 0;i<x.length();i++) {
			Character ch = x.charAt(i);
			if(Character.isDigit(ch)) {
				y = y + x.charAt(i);
			}
		}
		System.out.println(y);
				
	}

}
