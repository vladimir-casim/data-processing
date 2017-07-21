package strings;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
java.io.FileWriter class is used to write the characters to an existing text file. By default, it starts
writing the characters from the beginning of a file by overwriting the existing content. You can change this
by passing ‘true’ while constructing the FileWriter object. This opens the file in an append mode i.e it starts writing the characters
at the end of a text file.

Step 1 : Open an existing text file in an append mode by passing ‘true’ while constructing the FileWriter object.
Step 2 : Bundle FileWriter object in BufferedWriter if you are writing lots of text.
Step 3 : Use PrintWriter object if you are writing the text in multiple lines by wrapping BufferedWriter object in PrintWriter.
Step 4 : Use printWriter.println() method to write each line into a file.
 */
public class FileWriterExample {

    public static final String PATH = "src/main/resources/";

    public static void main(String[] args) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        PrintWriter printWriter = null;

        try {
            fileWriter = new FileWriter(PATH + "sample.txt", true);
            bufferedWriter = new BufferedWriter(fileWriter);
            printWriter = new PrintWriter(bufferedWriter);
            printWriter.println();
            printWriter.println("Venkatesh : 789546");
            printWriter.println("Daniel : 874566");
            printWriter.println("Shankar : 789546");
            System.out.println("Done");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try
            {
                printWriter.close();
                bufferedWriter.close();
                fileWriter.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }

}
