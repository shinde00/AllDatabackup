package Week_one;

public class Remove_char_from_string {

	public static void main(String[] args) {
		
		String str="azbzcdzzzezzf";
		String y="";
		char removalChar='z';
		
		for(int i=0;i<str.length();i++) {
			
			if(str.charAt(i)!='z') {
				
			y=y+str.charAt(i);	
				
			}
			
		}
		
		System.out.println(y);

	}

}
