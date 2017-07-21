package strings;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
Write a java program to find number of characters, number of words and number of lines in a text file.

Step 1 : Create BufferedReader object to read the text file.
Step 2 : Initialize charCount, wordCount and lineCount to 0.
Step 3 : Read all the lines of the text file one by one into currentLine using reader.readLine() method.
Step 4 : Update lineCount each time we read the line into currentLine.
Step 5 : We get the number of words in a line by splitting the currentLine by space.
Step 6 : Update the wordCount by adding the number of words in a line.
Step 7 : Update charCount by iterating through words array.
Step 8 : Close BufferedReader object.
*/
public class WordCountInFile {

    public static final String PATH = "src/main/resources/";

    public static void main(String[] args) {
        BufferedReader bufferedReader = null;
        int charCount = 0;
        int wordCount = 0;
        int lineCount = 0;

        try {
            bufferedReader = new BufferedReader(new FileReader(PATH + "sample.txt"));
            String currentLine = bufferedReader.readLine();

            while (currentLine != null) {
                lineCount++;
                String[] words = currentLine.split(" ");
                wordCount = wordCount + words.length;

                for (String word: words) {
                    charCount = charCount + word.length();
                }

                currentLine = bufferedReader.readLine();
            }

            System.out.println("Number Of Chars In A File : " + charCount);
            System.out.println("Number Of Words In A File : " + wordCount);
            System.out.println("Number Of Lines In A File : " + lineCount);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try
            {
                bufferedReader.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }

}
