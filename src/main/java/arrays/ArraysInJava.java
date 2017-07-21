package arrays;

/*

*/
public class ArraysInJava {

    public static void main(String[] args) {
        //Creating anonymous arrays
        System.out.println(new int[]{1, 2, 3, 4, 5}.length);
        System.out.println(new int[]{21, 14, 65, 24, 21}[1]);

        int[] array = new int[-5];     //No compile time error
        //but you will get java.lang.NegativeArraySizeException at run time

        // Yes, you can assign array of 100 elements to an array of 10 elements
        // provided they should be of same type. While assigning, compiler checks only type of the array not the size.
        int[] a = new int[10];
        int[] b = new int[100];
        a = b;      //Compiler checks only type, not the size

        //2D Arrays
        int[][] twoDArray1;
        int twoDArray2[][];
        int[] twoDArray3[];


//        int[][][] a1 = new int[][5][];    //Compile time error
//        int[][][] b1 = new int[5][][5];   //Compile time error
//        int[][][] c1 = new int[][5][5];   //Compile time error
    }

}
