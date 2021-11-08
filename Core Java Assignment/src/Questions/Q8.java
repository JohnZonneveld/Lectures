package Questions;

import java.util.ArrayList;
import java.util.Collections;

public class Q8 {
	public static void palindrome() {
		ArrayList<String> outputArray = new ArrayList<>();
//		List<String> strings = new ArrayList<String>();
//		Collections.addAll(strings,"A","B","C","D");
		ArrayList<String> testArray = new ArrayList<>();
		Collections.addAll(testArray, "karan", "madam","tom","civic","radar", "jimmy", "kayak", "john", "refer", "billy", "did");
				
		for (String s : testArray) {
			if (s.equals(ReverseStr(s))) {
				outputArray.add(s);
			}
		}
		
		//using for-each loop
	      System.out.println("\033[1m\nQ8\nPalindromes in list \033[0m");		
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

		return  new String(subArray);
	}
}
