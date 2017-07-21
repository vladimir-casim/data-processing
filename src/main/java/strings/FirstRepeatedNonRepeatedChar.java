package strings;

import java.util.HashMap;
import java.util.Scanner;

/*
Step 1 : Define one HashMap called charCountMap with Character as key and Integer as value. This map will hold the characters
and their count in the given string.
Step 2 : Convert inputString to char array called strArray.
Step 3 : Iterate through all chars of strArray and update their occurrences in charCountMap.
Step 4 : Iterate through all chars of strArray and check their count in charCountMap. Any first occurring character
with 1 as it’s count will be the first non-repeated character in inputString.
Step 5 : Iterate through all chars of strArray and check their count in charCountMap.
Any first occurring character with >1 as it’s count will be the first repeated character in inputString.
*/
public class FirstRepeatedNonRepeatedChar {

    static void firstRepeatedNonRepeatedChar(String inputString) {
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        char[] inputArray = inputString.toCharArray();
        for (Character ch: inputArray) {
            if (charCountMap.containsKey(ch))
                charCountMap.put(ch, charCountMap.get(ch) + 1);
            else
                charCountMap.put(ch, 1);
        }

        for (Character ch: inputArray) {
            if(charCountMap.get(ch) == 1) {
                System.out.println("First Non-Repeated Character In '" + inputString + "' is '" + ch + "'");
                break;
            }
        }

        for (Character ch: inputArray) {
            if(charCountMap.get(ch) > 1) {
                System.out.println("First Repeated Character In '" + inputString + "' is '" + ch + "'");
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :");
        String input = sc.next();
        firstRepeatedNonRepeatedChar(input);
    }

}
