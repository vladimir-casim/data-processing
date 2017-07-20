package strings;

/**
 * Write a java program to reverse a string
 */
public class ReverseTheString {

    /*
    In this method, we use reverse() method of StringBuffer class to reverse the string.
    Here is the code snippet to reverse the string using reverse() method of StringBuffer class.
     */
    public static void reverseString1(String input) {
        StringBuffer stringBuffer = new StringBuffer(input);
        System.out.println(stringBuffer.reverse());
    }

    /*
    In this method, first we convert given string to char array using charArray() method. And then we iterate that array in the reverse order
     */
    public static void reverseString2(String input) {
        char[] strArray = input.toCharArray();
        for (int i = strArray.length - 1; i >= 0; i--) {
            System.out.print(strArray[i]);
        }
    }

    /*
    Method which reverses the string by calling itself recursively.
    This method takes the first character of a string (str.charAt(0)) and puts it at the end of the string.
    And then calls itself on the remainder of the string (str.substring(1)). Finally adds these two things
    to get the reverse of the passed string (recursiveMethod(str.substring(1)) + str.charAt(0)). When
    the passed string is one character or less (str.length() <= 1), it stops calling
    itself and just returns the string passed.
     */
    public static String reverseString3(String s) {
        if (s.length() == 1) {
            return s;
        }
        String revStr = reverseString3(s.substring(1));
        return revStr + s.charAt(0);
    }

    public static void main(String[] args) {
//        reverseString1("String to be reversed");
//        reverseString2("String to be reversed");
        System.out.println(reverseString3("String to be reversed"));
    }

}
