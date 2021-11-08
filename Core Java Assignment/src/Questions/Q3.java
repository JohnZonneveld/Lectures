package Questions;

public class Q3 {

	public static String ReverseStr(String args) {
		char[] charArray = args.toCharArray();
		char [] subArray = new char[charArray.length];
		for (int j = charArray.length - 1; j >= 0; --j) {
			subArray[charArray.length -1 - j] = charArray[j];
		}
		System.out.println("\n\nQ3 String before reverse: " + args);
		char[] chars = args.toCharArray();
		int length = chars.length;
		System.out.print("\033[1mQ3 reversed string: \033[0m");
//		for (int i = length -1; i >= 0; i-- ) {
//			System.out.print(chars[i]);
//		}
		return  new String(subArray);
	}
	

}
