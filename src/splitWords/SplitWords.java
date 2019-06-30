package splitWords;

public class SplitWords {
	
	public static Stack splitWords(String inputStr) {
		TrieST st = GenTrie.genTrie();
		Stack wordStack = new Stack(inputStr.length());
		String partial = "";
		splitWordsHelper(st, wordStack, inputStr, partial, 0);		
		return wordStack;
	}
	
	public static void splitWordsHelper(TrieST st, Stack wordStack, String inputStr, String partial, int i) {
		if (i == inputStr.length()) {
			if (st.hasWord(partial)) {
				return;
			}
			String lastWord = wordStack.peek();
			wordStack.pop();
			i = i - partial.length();
			partial = lastWord;
			splitWordsHelper(st, wordStack, inputStr, partial, i);
			return;
		}
		partial = partial + inputStr.charAt(i);
		if (st.hasWord(partial)) {
			wordStack.push(partial);
			i += 1;
			if (i != inputStr.length()) {
				partial = "";
			}
			splitWordsHelper(st, wordStack, inputStr, partial, i);		
		}
		else {
			i += 1;
			splitWordsHelper(st, wordStack, inputStr, partial, i);					
		}
	}
	
	public static void main(String[] args) {
		//Stack wordStack = splitWords("ilikeeatingapple");
		Stack wordStack = splitWords("dogold");
		wordStack.display();
	}
}
