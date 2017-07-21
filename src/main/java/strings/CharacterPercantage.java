package strings;

import java.text.DecimalFormat;

/**
 Write a java program to find the percentage of uppercase letters, lowercase letters, digits and other special characters(including space) in the given string. F

 We use 3 important methods of java.lang.Character class to find the percentage of uppercase letters, lowercase letters, digits and other special characters. They are,
 Character.isUpperCase(ch) –> This method checks whether ‘ch’ is in uppercase or not.
 Character.isLowerCase(ch) –> This method checks whether ‘ch’ is in lowercase or not.
 Character.isDigit(ch) –> This method checks whether ‘ch’ is a digit or not.
 Below is the complete code to find out the percentage of uppercase letters, lowercase letters, digits and other special characters in the given string.
 */
public class CharacterPercantage {

    static void characterPercentage(String inputString) {
        int totalChars = inputString.length();
        int upperCaseLetters = 0;
        int lowerCaseLetters = 0;
        int digits = 0;
        int others = 0;

        for (int i = 0; i < inputString.length(); i++) {
            Character ch = inputString.charAt(i);
            if (Character.isUpperCase(ch)) {
                upperCaseLetters++;
            } else if (Character.isLowerCase(ch)) {
                lowerCaseLetters++;
            } else if (Character.isDigit(ch)) {
                digits++;
            } else {
                others++;
            }
        }

        double upperCaseLettersPercentage = (upperCaseLetters * 100) / totalChars;
        double lowerCaseLettersPercantege = (lowerCaseLetters * 100) / totalChars;
        double digitsPercentage = (digits * 100) / totalChars;
        double othersPercentage = (others * 100) / totalChars;

        DecimalFormat formatter = new DecimalFormat("##.##");
        System.out.println("In '" + inputString + "' : ");
        System.out.println("Uppercase letters are " + formatter.format(upperCaseLettersPercentage) + "% ");
        System.out.println("Lowercase letters are " + formatter.format(lowerCaseLettersPercantege) + "%");
        System.out.println("Digits Are " + formatter.format(digitsPercentage) + "%");
        System.out.println("Other Characters Are " + formatter.format(othersPercentage) + "%");
        System.out.println("-----------------------------");
    }

    public static void main(String[] args) {
        characterPercentage("Tiger Runs @ The Speed Of 100 km/hour.");
        characterPercentage("My e-mail : eMail_Address321@anymail.com");
        characterPercentage("AUS : 123/3, 21.2 Overs");
    }

}
