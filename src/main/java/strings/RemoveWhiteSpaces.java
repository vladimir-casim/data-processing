package strings;

/**
 * Remove all white spaces from a string
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
