package strings;

/*
 Split the given inputString into words using split() method. Then take each individual word,
 reverse it and append to reverseString. Finally print reverseString.
 */
public class ReverseEachWord {

    static void reverseEachWordOfString(String inputString) {
        String[] words = inputString.split(" ");
        String reversedString = "";

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            char[] wordArray = word.toCharArray();
            for (int j = wordArray.length - 1; j >= 0; j--) {
                reversedString = reversedString + wordArray[j];
            }
            reversedString = reversedString + " ";
        }
        System.out.println(reversedString);
    }

    public static void main(String[] args) {
        reverseEachWordOfString("oh baby");
    }

}
