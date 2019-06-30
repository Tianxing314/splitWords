package splitWords;

public class InputFormatting {

	public static String formatStr(String inputStr) {
		String modifiedStr = "";
		for (int i=0; i < inputStr.length(); i++) {
			//to upper case
			if (inputStr.charAt(i) >= 65 && inputStr.charAt(i) <= 90) {
				modifiedStr = modifiedStr + (char)(inputStr.charAt(i) + 32);
			}
			else if (inputStr.charAt(i) >= 97 && inputStr.charAt(i) <= 122) {
				modifiedStr += inputStr.charAt(i);
			}
		}
		return modifiedStr;
	}
	
	public static void main(String[] args) {
		//System.out.println(formatStr("AbCd*(@{cA"));
	}
}
