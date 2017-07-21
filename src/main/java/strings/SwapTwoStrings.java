package strings;

import java.util.Scanner;

/*
 To swap two string variables without using third or temp variable, we use substring() method of String class.
 This method has two overloaded forms.
 1) substring(int beginIndex) It returns substring of a calling string starting with the character at the specified index
 and ending with the last character of the calling string.
 2) substring(int beginIndex, int endIndex)
 It returns substring of a calling string starting with the character at beginIndex (inclusive) and ending with the character at endIndex (exclusive).
 We use both of these forms to swap two string variables without using third variable.
 */
public class SwapTwoStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First String :");
        String s1 = scanner.next();
        System.out.println("Enter Second String :");
        String s2 = scanner.next();
        System.out.println("Before Swapping :");
        System.out.println("s1 : " + s1);
        System.out.println("s2 : " + s2);

        s1 = s1 + s2;
        s2 = s1.substring(0, s1.length() - s2.length());
        s1 = s1.substring(s2.length());

        System.out.println("After Swapping :");
        System.out.println("s1 : " + s1);
        System.out.println("s2 : " + s2);
    }

}
