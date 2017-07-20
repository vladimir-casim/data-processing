package strings;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Write Java Program To Check Whether Two Strings Are Anagram Or Not?
 */
public class AnagramProgram {

    /*
    Using sort() and equals() Methods
    First we clean the input by removing all white spaces from the given two strings and change the case of all characters
    of both the strings to lower case so that case of both input strings will be ignored. After cleaning the input strings,
    we convert them to character array and sort them using sort() method of java.util.Arrays class. After sorting, we compare
    both the arrays using equals() method of same Arrays class.This method will return true if both arrays have same set of
    characters. Below is the complete anagram program using sort() and equals() methods.
     */
    static void isAnagram1(String s1, String s2) {
        boolean isAnagram = true;
        String copyOfs1 = s1.replaceAll("\\s", "");
        String copyOfs2 = s2.replaceAll("\\s", "");

        if (copyOfs1.length() != copyOfs2.length()) {
            isAnagram = false;
        } else {
            char[] s1Array = s1.toLowerCase().toCharArray();
            char[] s2Array = s2.toLowerCase().toCharArray();

            Arrays.sort(s1Array);
            Arrays.sort(s2Array);

            isAnagram = Arrays.equals(s1Array, s2Array);
        }

        if (isAnagram) {
            System.out.println(s1+" and "+s2+" are anagrams");
        } else {
            System.out.println(s1+" and "+s2+" are not anagrams");
        }
    }

    /*
    Using Iterative Method
    In this method, we go on checking each character of first string is present in second string.
    If it is present, we remove that character from second string and proceed to next character.
    If any character of first string is not present in second string, we break the loop and conclude that strings are not anagrams.
     */
    static void isAnagram2(String s1, String s2) {
        boolean isAnagram = true;
        String copyOfs1 = s1.replaceAll("\\s", "").toLowerCase();
        String copyOfs2 = s2.replaceAll("\\s", "").toLowerCase();

        if (copyOfs1.length() != copyOfs2.length()) {
            isAnagram = false;
        } else {
            char[] s1Array = copyOfs1.toCharArray();

            for (Character c: s1Array) {
                int index = copyOfs2.indexOf(c);
                if (index != -1) {
                    copyOfs2 = copyOfs2.substring(0, index) + copyOfs2.substring(index+1, copyOfs2.length());
                } else {
                    isAnagram = false;
                    break;
                }
            }
        }

        if (isAnagram) {
            System.out.println(s1+" and "+s2+" are anagrams");
        } else {
            System.out.println(s1+" and "+s2+" are not anagrams");
        }
    }

    /*
    Using StringBuilder
    This method is also same as above method. But in this method,
    we use StringBuilder deletechartAt() method to delete the character from second string if that character is present in it.
     */
    static void isAnagram3(String s1, String s2) {
        boolean isAnagram = true;
        String copyOfs1 = s1.replaceAll("\\s", "").toLowerCase();
        String copyOfs2 = s2.replaceAll("\\s", "").toLowerCase();

        if (copyOfs1.length() != copyOfs2.length()) {
            isAnagram = false;
        } else {
            char[] s1Array = copyOfs1.toCharArray();
            StringBuilder sb = new StringBuilder(copyOfs2);
            for (Character c: s1Array) {
                int index = sb.indexOf(""+c);
                if (index != -1) {
                    sb = sb.deleteCharAt(index);
                } else {
                    isAnagram = false;
                    break;
                }
            }
        }

        if (isAnagram) {
            System.out.println(s1+" and "+s2+" are anagrams");
        } else {
            System.out.println(s1+" and "+s2+" are not anagrams");
        }
    }

    /*
    Using HashMap
    In this method, we construct one HashMap object with character as Key and character occurrences as Value.
    We increment character count by 1 if the character is present in first string and decrement it by 1 if that
    character is present in second string. At last, we check character count for each character in the map.
    If any count is not equal to 0, then given strings are not anagrams.
     */
    static void isAnagram4(String s1, String s2) {
        boolean isAnagram = true;
        String copyOfs1 = s1.replaceAll("\\s", "").toLowerCase();
        String copyOfs2 = s2.replaceAll("\\s", "").toLowerCase();

        if (copyOfs1.length() != copyOfs2.length()) {
            isAnagram = false;
        } else {
            HashMap<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < copyOfs1.length(); i++) {
                char charAsKey = copyOfs1.charAt(i);
                int charCountAsValue = 0;
                if (map.containsKey(charAsKey)) {
                    charCountAsValue = map.get(charAsKey);
                }

                map.put(charAsKey, ++charCountAsValue);
                charAsKey = copyOfs1.charAt(i);
                charCountAsValue = 0;
                if (map.containsKey(charAsKey)) {
                    charCountAsValue = map.get(charAsKey);
                }

                map.put(charAsKey, charCountAsValue);
            }

            for (int value : map.values())
            {
                if(value != 0) isAnagram = false;
            }
        }

        if (isAnagram) {
            System.out.println(s1+" and "+s2+" are anagrams");
        } else {
            System.out.println(s1+" and "+s2+" are not anagrams");
        }
    }

    public static void main(String[] args) {
        isAnagram1("SiLeNt CAT", "LisTen AcT");
        isAnagram2("SiLeNt CAT", "LisTen AcT");
        isAnagram3("SiLeNt CAT", "LisTen AcT");
        isAnagram4("SiLeNt CAT", "LisTen AcT");
        System.out.println(" ---------------- ");
        isAnagram1("Toss", "Shot");
        isAnagram2("Toss", "Shot");
        isAnagram3("Toss", "Shot");
        isAnagram4("Toss", "Shot");
    }

}
