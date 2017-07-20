package strings;

import java.util.HashMap;

/**
 * Count Occurrences Of Each Character In String
 * To find the number of occurrences of each character in a given string, we have used HashMap with character as a key and it’s occurrences as a value.
 * First, we convert the given string to char array and check each character one by one. And update it’s count in HashMap.
 */
public class EachCharCountInString {

    public static void characterCount(String inputString) {
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        char[] inputChars = inputString.toCharArray();
        for (char c: inputChars) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                charCountMap.put(c, 1);
            }
        }

        System.out.println(charCountMap);
    }

    public static void main(String[] args) {
        characterCount("dfrerd");
    }
}
