package strings;

import java.util.HashMap;
import java.util.Set;

/**
 * Write a java program to find the duplicate words and their number of occurrences in a string?
 */
public class DuplicateWordsInString {

    public static void duplicateWords(String inputString) {
        String[] words = inputString.split(" ");
        HashMap<String, Integer> wordCount = new HashMap<>();

        for (String word: words) {
            if (wordCount.containsKey(word.toLowerCase())) {
                wordCount.put(word.toLowerCase(), wordCount.get(word.toLowerCase()) + 1);
            } else {
                wordCount.put(word.toLowerCase(), 1);
            }
        }

        Set<String> wordsSet = wordCount.keySet();
        for (String word: wordsSet) {
            if (wordCount.get(word) > 1) {
                System.out.println(word + " " +wordCount.get(word));
            }
        }
    }

    public static void main(String[] args) {
        duplicateWords("Bread butter and bread");
        duplicateWords("Java is java again java");
        duplicateWords("Super Man Bat Man Spider Man");
    }

}
