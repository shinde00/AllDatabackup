package practices;

import java.util.Arrays;
import java.util.HashSet;

public class unique_touples {

	public static HashSet<String> uniqueTuples(String input, int len) throws IllegalArgumentException {
		HashSet<String> resultSet = new HashSet<String>();
		int inputLength = 0;

		if (input == null) {
			throw new IllegalArgumentException("Input string cannot be null.");
		} else {
			inputLength = input.length();
		}

	

		for (int i = 0; i < (inputLength - len + 1); i++) {
			resultSet.add(input.substring(i, (i + len)));
		}

		return resultSet;
	}

	public static void main(String[] args) {
		
		String input = "aab";
		String input1 = "abbccde";

		HashSet<String> result = uniqueTuples(input, 2);
		HashSet<String> result1 = uniqueTuples(input1, 2);
		
		if ((result.contains("aa") && result.contains("ab"))
				&& (result1.containsAll(Arrays.asList("ab", "bb", "bc", "cc", "cd", "de")) && result1.size() == 6)) {
			System.out.println("Test passed.");
		} else {
			System.out.println("Test failed.");
		}}}
