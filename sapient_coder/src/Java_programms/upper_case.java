package Java_programms;

public class upper_case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x = "My SpAce ClaSs";
		String y =" ";
		for(int i=0;i<x.length();i++) {
			Character s= x.charAt(i);
			if(Character.isUpperCase(s)) {
				y=y+Character.toLowerCase(s);
				
			}else {
				y=y+Character.toUpperCase(s);
			}
		}
		System.out.println(y);
	}

}
