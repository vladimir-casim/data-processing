package strings;

/**
 * Write a java program to count the total number of occurrences of a given character in a string without using any loop?
 */
public class CountCharacterOccurence {

    public static void main(String[] args) {
        String string = "Java is java again java again";
        char c = 'a';
        int count = string.length() - string.replace("a", "").length();
        System.out.println("Number of occurances of a: " + count);
    }

}
