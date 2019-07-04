# splitWords
Recognize and split a string of words without spaces in between

Recognize and split a string of undivided words 
ie. "Iamtiredtosayhelloworld" to "I am tired to say hello world"

usa.text:
source: http://www.gwicks.net/dictionaries.htm
(USA English 61000 words)

VERSION 0.0.1
API: splitWords.resultInStrArr(inputStr)

Input: String inputStr
The inputStr contains a string of English words which are included in the usa.txt file only. The space between words can be missing, and non-letter characters can be presented in the inputStr. The words in inputStr MUST BE CORRECT(ie. words must be in the text file usa.txt which can be replaced by user's own file)! For example, "Hel*lowO%r3ld" is valid but "Hel*loO%r3ld" IS NOT, as the second string after formatting and filtering is "helloorld", which can not be intepreted and saparated.

Output: String[]
The output is a string array which contains separated words one in each string index block. The result of inputting "Hel*lowO%r3ld" is ["hello", "world"], and the result of invalid input "Hel*loO%r3ld" will be a warning ["WARNING: Input string contain incorrect English word(s)"]. 

Constraints:
The API is designed to separate words NOT based on the English language syntax or sysmantics. The output will be first-word_favoured. For example, if the inputStr is "iamamonster", the output will be ["i", "a", "ma", "monster"] NOT ["i", "am", "a", "monster"]. The reason is that both "a" and "ma" are valid words in usa.txt file, thus, when seeing "ama", the method will favoureds first word which is "a". If word "ma" is deleted from usa.txt file, the output will then be ["i", "am", "a", "monster"] because there is not way to separate the inputStr if the first two words are ["i", "a"]. 

The text file usa.txt which contains ~61000 English words is encouraged to be replaced by user's own words text file chosen based on the project's scope and usecase. If the project's scope is to separate words to make a shopping list, then the usa.txt should be replaced to the text file containing variety of merchandise names only. Text file containing too much words beyond the project's scope will cause problem! 
