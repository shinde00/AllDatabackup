package Week_one;

public class programmfortech {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String  name="Rushikesh is taking an interview";
	String y="";
	for(int i=0; i<name.length();i++) {
		if(name.charAt(i)=='i') {
		y=y+" "+name.charAt(i)+" ";	
		
		}else {
			y=y+name.charAt(i);
		}
	}
	String input=y;
	System.out.println("input  :"+input);
	String a[]= input.split(" ");
	String output="";
	for(int j=0;j<a.length;j++) {
		
	for(int i=a[j].length()-1;i>=0;i--) {
		
		output=output+a[j].charAt(i);
	}
	output=output+" ";
	}
	System.out.println("output :"+output+"");
		
	}

}
