package strings;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
Write a java program to find the most repeated word in text file.
Step 1 : Create one HashMap object called wordCountMap which will hold words of the input file as keys and their occurrences as values.
Step 2 : Create BufferedReader object to read the input text file.
Step 3 : Read all the lines of input text file one by one into currentLine using reader.readLine() method.
Step 4 : Split the currentLine into words by using space as delimiter. Use toLowerCase() method here if you don’t want case sensitiveness.
Step 5 : Iterate through each word of words array and check whether the word is present in wordCountMap.
If word is already present in wordCountMap, update its count. Otherwise insert the word as a key and 1 as its value.
Step 6 : Get the mostRepeatedWord and its count by iterating through each entry of the wordCountMap.
Step 7 : Close the resources.
*/
public class RepeatedWordInFile {

    public static final String PATH = "src/main/resources/";

    public static void main(String[] args) {
        HashMap<String, Integer> wordCountMap = new HashMap<String, Integer>();
        BufferedReader bufferedReader = null;
        try {
            File file = new File(PATH + "sample.txt");
            bufferedReader = new BufferedReader(new FileReader(file));
            String currentLine = bufferedReader.readLine();
            while (currentLine != null) {
                String[] words = currentLine.split(" ");
                for (String word: words) {
                    if (wordCountMap.containsKey(word))
                        wordCountMap.put(word, wordCountMap.get(word) + 1);
                    else
                        wordCountMap.put(word, 1);
                }
                currentLine = bufferedReader.readLine();
            }

            String mostRepeatedWord = null;
            int count = 0;

            Set<Map.Entry<String, Integer>> entrySet = wordCountMap.entrySet();
            for (Map.Entry<String, Integer> entry: entrySet) {
                if (entry.getValue() > count) {
                    count = entry.getValue();
                    mostRepeatedWord = entry.getKey();
                }
            }

            System.out.println("The most repeated word in input file is : "+mostRepeatedWord);
            System.out.println("Number Of Occurrences : "+count);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
