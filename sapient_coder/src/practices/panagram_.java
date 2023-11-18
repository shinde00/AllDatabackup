package practices;

import java.util.SortedSet;
import java.util.TreeSet;

public class panagram_ {
	private static class PanagramDetector {
		  private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
       public String findMissingLetters(String sentence) {
		    SortedSet<Character> set = new TreeSet<Character>();
		    for (int i = 0; i < ALPHABET.length(); i++) {
		    set.add(ALPHABET.charAt(i));
		    }
           String s = sentence.toLowerCase();

		    for (int i = 0; i < s.length(); i++) {
		    set.remove(s.charAt(i));
		    }

		    StringBuilder sb = new StringBuilder();
		    for (Character c : set) {
		  sb.append(c.charValue());
		   }
		   return sb.toString();
       }

		  }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 PanagramDetector pd = new PanagramDetector();
		  boolean success = true;

		  success = success && "".equals(pd.findMissingLetters("the quick brown fox jumps over the lazy dog"));
		  success = success && "abcdefghijklmnopqrstuvwxyz".equals(pd.findMissingLetters(""));

		  if (success) {
		    System.out.println("Passed");
		  } else {
		    System.out.println("Failed");
		  }
		  }
	}


