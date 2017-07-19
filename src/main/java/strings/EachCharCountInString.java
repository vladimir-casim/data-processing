package strings;

import java.util.HashMap;

/**
 * Count Occurrences Of Each Character In String :
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
