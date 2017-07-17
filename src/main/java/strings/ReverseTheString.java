package strings;

/**
 * Write a java program to reverse a string
 */
public class ReverseTheString {

    public static void reverseString1(String input) {
        StringBuffer stringBuffer = new StringBuffer(input);
        System.out.println(stringBuffer.reverse());
    }

    public static void reverseString2(String input) {
        char[] strArray = input.toCharArray();
        for (int i = strArray.length - 1; i >= 0; i--) {
            System.out.print(strArray[i]);
        }
    }

    public static String reverseString3(String s) {
        if (s.length() == 1) {
            return s;
        }
        String revStr = reverseString3(s.substring(1));
        return s + revStr;
    }

    public static void main(String[] args) {
//        reverseString1("String to be reversed");
//        reverseString2("String to be reversed");
        System.out.println(reverseString3("String to be reversed"));
    }

}
