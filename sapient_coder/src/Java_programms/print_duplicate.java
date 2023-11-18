package Java_programms;

import java.util.ArrayList;

public class print_duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String x = "indian";
		String y=" ";
		String c ;
		
		ArrayList<Character> s= new ArrayList<Character>();
		
		for(int i=0;i<x.length();i++) {
			
			if(!s.contains(x.charAt(i))) {
				
			s.add(x.charAt(i));
			
				
			}else {
				y=y+x.charAt(i);
			}
			
		}
		
		System.out.println(y);
	}

}
