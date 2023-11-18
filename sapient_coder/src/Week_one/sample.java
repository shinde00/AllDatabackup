package Week_one;

class magic{
	
	public static String demo(char[] character) {
		
			 StringBuilder jarvis = new StringBuilder();

	        for (char code : character) {
	            jarvis.append(code);
	        } 
			return jarvis.toString();
	}
}
public class sample {

	public static void main(String[] args) {
	
	System.out.println(	magic.demo(new char[] { 105, 32, 108, 111, 118, 101, 32, 117 , 32, 110, 105, 108, 97, 109}));
	       
}}
