package strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Write a java program to count the number of words in a string?
 */
public class CountTheWords {

    public static void countWords1(String inputString) {
        System.out.println("countWords1 method");
        Scanner input = new Scanner(inputString);
        List<String> wordList = new ArrayList<>();
        while (input.hasNext()) {
            wordList.add(input.next());
        }

        System.out.println("Number of words in the string: " + wordList.size());
    }

    public static void countWords2(String inputString) {
        System.out.println("countWords2 method");
        Scanner input = new Scanner(inputString);
        String inputLine = input.nextLine();
        String[] wordArray = inputLine.trim().split(" ");
        System.out.println("Number of words in the string: " + wordArray.length);
    }

    public static void countWords3(String inputString) {
        System.out.println("countWords3 method");
        Scanner input = new Scanner(inputString);
        String inputLine = input.nextLine();
        int count = 1;
        for (int i = 0; i < inputLine.length() - 1; i++) {
            if (inputLine.charAt(i) == ' ' && inputLine.charAt(i + 1) != ' ') {
                count++;
            }
        }

        System.out.println("Number of words in the string: " + count);
    }

    public static void main(String[] args) {
        countWords1("The entered string");
        countWords2("The entered string");
        countWords3("The entered string");
    }

}
