package splitWords;

public class TrieST {
	private final static int R = 26; //alphabet size
	private Node root = new Node();
	
	public static class Node {
		private boolean isWord = false;
		private Node[] next = new Node[R];
		
	}
	
	public void put(String key) {
		root = put(root, key, 0);
	}
	
	private Node put(Node x, String key, int i) {
		if (x == null) {
			x = new Node();
		} 
		if (i == key.length()) {
			x.isWord = true;
			return x;
		}
		int c = charToInt(key.charAt(i));
		x.next[c] = put(x.next[c], key,i+1);
		return x;
	}	
	
	public boolean hasWord(String key) {
		Node x = get(root, key, 0);
		if (x == null) return false;
		return x.isWord;
	}
	
	private Node get(Node x, String key, int i) {
		if (x == null) return null;
		if (i == key.length()) return x;
		int c = charToInt(key.charAt(i));
		return get(x.next[c], key, i+1);
	}
	
	private int charToInt(char c) {
		return c-97;
	}
	public static void main(String[] args) {
		/*
		TrieST a = new TrieST(); 
		a.put("cat");
		boolean b = a.root.next[2].isWord;
		System.out.println(b);
		System.out.println(a.hasWard("cat"));
		*/
	}
}
