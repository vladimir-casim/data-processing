package strings;

/**
 You are also often need to do the reverse conversion i.e converting from integer to string.
 Java provides couple of methods to do that also. one is Integer.toString()
 method and another one is String.valueOf() method. Both these methods
 return string representation of the given integer.
 */
public class IntegerString {

    public static void integerToString(int n) {
        String s1 = Integer.toString(n);
        String s2 = String.valueOf(n);
    }

    public static void stringToInteger(String s) {
        int i = Integer.valueOf(s);
        System.out.println(i);
        i = Integer.parseInt(s);
        System.out.println(i);
    }

    public static void main(String[] args) {
        integerToString(2017);
        stringToInteger("2017");
    }

}
