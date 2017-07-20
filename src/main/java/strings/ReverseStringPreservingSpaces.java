package strings;

/**
 the position of spaces in the original string are maintained in the reversed string also
 First, we convert the given ‘inputstring’ to char array and call it as ‘inputStringArray’.
 We define one more char array called ‘resultArray’ with the same size as ‘inputStringArray’. In the first for loop,
 for every space in the ‘inputStringArray’, we insert space in the ‘resultArray’ at the corresponding positions.
 In the second for loop, we copy non-space characters of ‘inputStringArray’ starting from first to last into the
 ‘resultArray’ at ‘j’ position where ‘j’ will have value from length of resultArray to 0. Before copying, we check
 whether the ‘resultArray’ already contains a space at index ‘j’ or not. If it contains, we copy the character
 in the next position. See the below image for more clarity.
 */
public class ReverseStringPreservingSpaces {

    public static void reverseString(String inputString) {
        char[] inputStringArray = inputString.toCharArray();
        char[] resultArray = new char[inputStringArray.length];

        for (int i = 0; i < inputStringArray.length; i++) {
            if (inputStringArray[i] == ' ') {
                resultArray[i] = ' ';
            }
        }

        int j = resultArray.length - 1;
        for (int i = 0; i < inputStringArray.length; i++) {
            if (inputStringArray[i] != ' ') {
                if (resultArray[j] == ' ') {
                    j--;
                }
                resultArray[j] = inputStringArray[i];
                j--;
            }
        }
        System.out.println(inputString + " ---> " + String.valueOf(resultArray));
    }

    public static void main(String[] args) {
        reverseString("I Am Not String");
    }
}
