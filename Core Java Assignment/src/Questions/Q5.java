package Questions;

public class Q5 {

	public static String IndexedStr(String str, int index) {
		char[] array = str.toCharArray();String shortStr = "";
		for (int i = 0; i < index; i++) {
			shortStr= shortStr + array[i];
		}
		return shortStr;

	}

}
