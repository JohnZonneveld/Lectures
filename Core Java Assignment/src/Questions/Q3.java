package Questions;

public class Q3 {

	public static String ReverseStr(String args) {
		char[] charArray = args.toCharArray();
		char [] subArray = new char[charArray.length];
		for (int j = charArray.length - 1; j >= 0; --j) {
			subArray[charArray.length -1 - j] = charArray[j];
		}
		System.out.println("\033[1m\n\nQ3\nString before reverse: \033[0m\n" + args);
		System.out.print("\033[1mReversed string: \033[0m\n");
		return  new String(subArray);
	}
	

}
