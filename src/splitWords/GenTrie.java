package splitWords;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class GenTrie {
	public static TrieST genTrie() {
		TrieST st = new TrieST();
		
		// The name of the file to open.
        String fileName = "usa.txt";

        // This will reference one line at a time
        String line = null;
		try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = 
                new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                if (isValid(line)) {
                	st.put(line);
                }           
            }   

            // Always close files.
            bufferedReader.close();         
        } catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");  
        }
		
		return st;
	}
	
	private static boolean isValid(String s) {
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) < 97 || s.charAt(i) >122) {
				return false;
			}			
		}
		return true;
	}
	
	public static void main(String[] args) {
		TrieST st = genTrie();
		System.out.println(st.hasWord("cat"));
	}
	
	
}
