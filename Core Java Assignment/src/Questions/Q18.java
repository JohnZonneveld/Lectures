package Questions;

public class Q18 extends Q18Upperclass {

	public Q18() {
		
		System.out.println("\n\n\033[1mQ18\033[0m");
	}

	@Override
	public
	boolean checkForUpper(String str) {
		for (int i = 0;i < str.length(); ++i) {
			if (Character.isUpperCase(str.charAt(i)))
				return true;
		}
		return false;
	}

	@Override
	public
	String toLowers(String str) {
		String lowercaseString = "";
		for (int i = 0; i < str.length(); ++i) {
			lowercaseString += Character.toLowerCase(str.charAt(i));
		}
		return lowercaseString;
	}

	@Override
	public
	int toInteger(String str) {
		int total = 0;
		for (int i = 0; i < str.length(); ++i) {
			total += Character.getNumericValue(str.charAt(i));
		}
		return total;
	}

}
