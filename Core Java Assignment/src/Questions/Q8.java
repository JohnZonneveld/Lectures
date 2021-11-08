package Questions;

import java.util.ArrayList;

public class Q8 {
	public static void palindrome() {
		ArrayList<String> outputArray = new ArrayList<>();
		String[] inputArray = {"karan", "madam","tom","civic","radar", "jimmy", "kayak", "john", "refer", "billy", "did"};

		for (int i = 0; i<inputArray.length; i++) {
			String testString = inputArray[i];
			if (testString.equals(ReverseStr(testString))) {
				outputArray.add(inputArray[i]);
			}
		}
		
		//using for-each loop
	      System.out.println("\033[1m\nQ8 palindrome in list \033[0m");		
	      for (String str : outputArray)
	      { 		      
	           System.out.println(str); 		
	      }
	}
	

	public static String ReverseStr(String args) {
		char[] charArray = args.toCharArray();
		char [] subArray = new char[charArray.length];
		for (int j = charArray.length - 1; j >= 0; --j) {
			subArray[charArray.length -1 - j] = charArray[j];
		}
		char[] chars = args.toCharArray();
		int length = chars.length;

		return  new String(subArray);
	}
}
