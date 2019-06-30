package splitWords;

public class SplitWords {
	//result in String Array
	public static String[] resultInStrArr(String wordsStr) {
		String[] res = new String[1];
		try {
			Stack wordStack = splitWords(wordsStr);
		
			String[] resInStrArr = new String[wordStack.top+1];
		//get rid of null value
			for (int i = 0; i <= wordStack.top; i++) {
				resInStrArr[i] = wordStack.s[i];
			}
			return resInStrArr;
		} catch (Exception e) {
			//System.out.println("invalid input");
		}
		res[0] = "WARNING: Input string contain incorrect English word(s)";
		return res;
	}
	
	//result in stack
	public static Stack splitWords(String wordsStr) {
		wordsStr = InputFormatting.formatStr(wordsStr); 
		TrieST st = GenTrie.genTrie();
		Stack wordStack = new Stack(wordsStr.length());
		String partial = "";
		splitWordsHelper(st, wordStack, wordsStr, partial, 0);		
		return wordStack;
	}
	
	private static void splitWordsHelper(TrieST st, Stack wordStack, String wordsStr, String partial, int i) {
		if (i == wordsStr.length()) {
			if (st.hasWord(partial)) {
				return;
			}
			String lastWord = wordStack.peek();
			wordStack.pop();
			i = i - partial.length();
			partial = lastWord;
			splitWordsHelper(st, wordStack, wordsStr, partial, i);
			return;
		}
		partial = partial + wordsStr.charAt(i);
		if (st.hasWord(partial)) {
			wordStack.push(partial);
			i += 1;
			if (i != wordsStr.length()) {
				partial = "";
			}
		}
		else {
			i += 1;				
		}
		splitWordsHelper(st, wordStack, wordsStr, partial, i);	
	}
	
	
	public static void main(String[] args) {
		String inputStr = "Mynamedarinis";
		String[] resInStrArr = resultInStrArr(inputStr);
		for (int i = 0; i < resInStrArr.length; i++) {
			System.out.println(resInStrArr[i]);
		}
	}
}
