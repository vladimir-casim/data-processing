package strings;

/**
 * Using replaceAll() Method.
 * In the first method, we use replaceAll() method of String class to remove all white spaces (including tab also) from a string.
 * This is the one of the easiest method to remove all white spaces from a string. This method takes two parameters. One is the string to
 * be replaced and another one is the string to be replaced with. We pass the string “\s” to be replaced with an empty string “”.
 *
 * Without Using replaceAll() Method.
 * Remove all white spaces from a string
 * In the second method, we remove all white spaces (including tab also) from a string
 * without using replaceAll() method. First we convert the given string to char array and then
 * we traverse this array to find white spaces. We append the characters which are not the
 * white spaces to StringBuffer object.

 */
public class RemoveWhiteSpaces {

    public static void main(String[] args) {
        String str = "  Core java";
        String strWithoutSpace = str.replaceAll("\\s", "");
        System.out.println(strWithoutSpace);

        char[] strChars = str.toCharArray();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < strChars.length; i++) {
            if( (strChars[i] != ' ') && (strChars[i] != '\t') ) {
                sb.append(strChars[i]);
            }
        }

        System.out.println(sb.toString());
    }

}
