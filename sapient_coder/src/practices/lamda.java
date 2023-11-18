package practices;

public class lamda {

	
	
		    public static String removeDuplicates(String string) {
		        // Create an empty StringBuilder to store non-duplicate characters
		        StringBuilder nonDuplicates = new StringBuilder();

		        // Iterate over each character in the string
		        for (int i = 0; i < string.length(); i++) {
		            char currentChar = string.charAt(i);

		            // Check if the character is already in the non-duplicates StringBuilder
		            if (nonDuplicates.indexOf(String.valueOf(currentChar)) == -1) {
		                // If not, append it to the StringBuilder
		                nonDuplicates.append(currentChar);
		            }
		        }

		        // Convert the non-duplicates StringBuilder into a String and return it
		        return nonDuplicates.toString();
		    }

		    public static void main(String[] args) {
		        String inputString = "Hello, world!";
		        String outputString = removeDuplicates(inputString);

		        System.out.println("Input string: " + inputString);
		        System.out.println("Output string: " + outputString);
		        
		      String c= c1("5000");
		      System.out.println(c);
		        
		        
		    }
		    public static String c1(String b) {
	        	return b;
	        }
		

		
	

}
