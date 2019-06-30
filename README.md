# splitWords
Recognize and split a string of words without spaces in between

Recognize and split a string of undivided words 
ie. "Iamtiredtosayhelloworld" to "I am tired to say hello world"

usa.text:
source: http://www.gwicks.net/dictionaries.htm
(USA English 61000 words)

VERSION 0.0.1
1. splitWords(words, mode)  
Assumptions:
   - a. The words that the program is dealing with are from the usa.txt only.
   - b. Can include non-letter characters
   - c. The undivided words in input string are correct in terms of spelling after getting rid of non-letter characters.
   
ie. 
valid: Hel@lo, hell&owo6rld
invalid: Helllo, hellow#world
Input:
words: character string type. maximum of 50 characters()
mode: int type which can choose from below
   - a. return all possible combinations as result
      ie.  parameter words is "uppercaseletter", the result should be "up per case letter; upper case letter; uppercase letter"
   - b. return the best option:
  ie. the same input words as above shall output "uppercase letter"
   - Output: A character string type contains the divided words based on the mode, which is described above.
   - Helper functions: filter(), forceSplit(), toHash(), getValue()

2. filter(words)  
   - Input: a character string contains all ASCII characters
   - Output: a chracter string contains letter charactrs only, and the order should be consistent with the input string

3. forceSplit(filtered_words)  
   - Input: a character string contains letter character only
   - Output: a character string contains the first correct word from filtered_words
   - helper function: toHash(), getValue(),

4. genHashTable(wordsData)  
   - input: usa.txt 
   - output: void. convert the wordsData to hashtable
   - helper functions: insert

5. insert(word)  
   - Input: one word from usa.txt
   - Output: void. Add the word to hashtable
   - Helper function: toHash

6. toHash(word)
   - Input: a string of letter characters
   - Output: a hashtable key of type integer

7. getValue()
   - Input: hash key in integer
   - Output: correponding word of char string type

