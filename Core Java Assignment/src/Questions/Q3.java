package Questions;

public class Q3 {

	public static void ReverseStr(String args) {
//		String inputString = "Pega cohort September 20th 2021";
		System.out.println("\n\nQ3 String before reverse: " + args);
		char[] chars = args.toCharArray();
		int length = chars.length;
		System.out.print("\nResult for Q3: ");
		for (int i = length -1; i >= 0; i-- ) {
			System.out.print(chars[i]);
		}

	}
//	return ;

}
