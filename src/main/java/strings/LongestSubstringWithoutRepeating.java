package strings;

import java.util.LinkedHashMap;

/*
Step 1 : Convert the given inputString to an array of characters called charArray.
Step 2 : Initialize longestSubstring to null and longestSubstringLength to 0.
Step 3 : Define one LinkedHashMap called charPosMap. It will hold characters of inputString as keys and their position
as values. Here, we have used LinkedHashMap instead of HashMap because it maintains the insertion order of elements.
Step 4 : For every char ch in charArray, check whether it is already present in charPosMap. If it is not present,
add this char to charPosMap along with its position.
Step 5 : If char ch is present in charPosMap, reposition the cursor i to the position of ch and clear the charPosMap.
Step 6 : Check whether the size of charPosMap is greater than longestSubstringLength. If it is greater than
longestSubstringLength, assign the size of charPosMap to longestSubstringLength and its keySet to longestSubstring.
Step 7 : Print longestSubstring and longestSubstringLength.
*/
public class LongestSubstringWithoutRepeating {


    static void longestSubstring(String inputString) {
        char[] inputChars = inputString.toCharArray();
        String longestSubstring = null;
        int longestSubstringLength = 0;
        LinkedHashMap<Character, Integer> charPosMap = new LinkedHashMap<>();
        for (int i = 0; i < inputChars.length; i++) {
            char ch = inputChars[i];
            if (!charPosMap.containsKey(ch)) {
                charPosMap.put(ch, i);
            } else {
                i = charPosMap.get(ch);
                charPosMap.clear();
            }
            if(charPosMap.size() > longestSubstringLength)
            {
                longestSubstringLength = charPosMap.size();
                longestSubstring = charPosMap.keySet().toString();
            }
        }

        System.out.println("Input String : " + inputString);
        System.out.println("The longest substring : " + longestSubstring);
        System.out.println("The longest Substring Length : " + longestSubstringLength);
    }

    public static void main(String[] args) {
        longestSubstring("javaconceptoftheday");
        System.out.println("==========================");
        longestSubstring("thelongestsubstring");
    }

}
