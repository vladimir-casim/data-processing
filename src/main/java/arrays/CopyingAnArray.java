package arrays;


import java.util.Arrays;

public class CopyingAnArray {

    /*
        We are defining an array of ints. We are copying that array to another array of ints. You can notice that changing the value of
        one array will be reflected in another array also. That means, both the array variables(a and b) are pointing to same object in the memory.

        If you copy an array using above method, changes made in one array will be reflected in other.
        Normally, you don’t want such behaviour in real time. You may need two different array objects with
        same set of elements. In such scenarios, Instead of using the above method, use any one of the following methods.
    */
    static void method1() {
        int[] a = {12, 21, 0, 5, 7};
        int[] b = a; //copying array 'a' to array 'b'

        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }

        a[2] = 56;  //Changing value of 3rd element of array 'a'
        System.out.println(b[2]); //value of 3rd element of array 'b' also changes
        b[4] = 100;
        System.out.println(a[4]);
    }


    static void method2() {
        int[] a = {12, 21, 0, 5, 7};
        int[] b = Arrays.copyOf(a, a.length);

        for (int i = 0; i < b.length; i++)
            System.out.println(b[i]);

        a[2] = 56;
        System.out.println(b[2]);
        b[4] = 100;
        System.out.println(a[4]); //value of 5th element in array 'a' will not change
    }

    /*
        All arrays will have clone() method inherited from java.lang.Object class. Using this method, you can copy an array.
    */
    static void method3() {
        int[] a = {12, 21, 0, 5, 7};
        int[] b = a.clone();

        for (int i = 0; i < b.length; i++)
            System.out.println(b[i]);

        //Now changing values of one array will not reflect in other array

        a[2] = 56;
        System.out.println(b[2]);
        b[4] = 100;
        System.out.println(a[4]);
    }

    /*
        Declaring and initializing an array of ints
        Creating an array object of same length as array 'a'
        Creating a copy of array 'a' using arraycopy() method of System class
        Printing elements of array 'b'
        Using arraycopy() method of System class, you can copy a part of an array into another array.
    */
    static void method4() {
        int[] a = {12, 21, 0, 5, 7};
        int[] b = new int[a.length];

        System.arraycopy(a, 0, b, 0, a.length);

        for (int i = 0; i < b.length; i++)
            System.out.println(b[i]);

        a[2] = 56;
        System.out.println(b[2]);
        b[4] = 100;
        System.out.println(a[4]);
    }

    public static void main(String[] args) {
        method1();
        method2();
        method3();
        method4();
    }

}
