package arrays;

import java.util.Arrays;

/*
Given an integer array, you have to separate all zero elements from non-zero elements.
You have to move zeros either to end of the array or bring them to beginning of the array.

 */
public class SeparateZerosFromNonZeros {

    /*
    Let ‘inputArray‘ be the given array. We maintain one variable called ‘counter‘. This variable will keep the track
    of all non-zero elements. First we initialize this variable to 0. We start traversing the given array from left to right.
    Whenever we find the non-zero element, we move that element to position where ‘counter‘ points
    i.e inputArray[counter] = inputArray[i] and increment the ‘counter‘. After traversing all the elements, all non-zero
    elements will be at the front and ‘counter‘ will be pointing to next to last non-zero element. Using this pointer,
    we assign 0 to all remaining elements of the array. Thus, all non-zero elements will be at the front and zero elements
    will be at the end of the given array.
     */
    static void moveZerosToEnd(int inputArray[]) {
        int counter = 0;
        for (int i = 0; i <= inputArray.length - 1; i++) {
            if (inputArray[i] != 0) {
                inputArray[counter++] = inputArray[i];
            }
        }

        while (counter < inputArray.length) {
            inputArray[counter++] = 0;
        }

        System.out.println(Arrays.toString(inputArray));
    }

    /*
    How To Bring Zeros To The Front Of An Array?
    Here also we use the same logic. But, here we traverse the ‘inputArray’ in the reverse direction.
    We initialize the ‘counter‘ variable to the position of last element. We start traversing the given array from right
    to left. Whenever we find non-zero element, we move that element to position where ‘counter‘ points and decrement the
    counter by 1. After traversing all elements of the array, all non-zero elements will be at the end of an array and
    ‘counter‘ will be pointing to previous of first non-zero element. Using this pointer, we assign 0 to all remaining
    elements of the array.
     */
    static void moveZerosToFront(int inputArray[]) {
        int counter = inputArray.length - 1;
        for (int i = inputArray.length - 1; i > 0; i--) {
            if (inputArray[i] != 0) {
                inputArray[counter--] = inputArray[i];
            }
        }

        while (counter >= 0) {
            inputArray[counter--] = 0;
        }

        System.out.println(Arrays.toString(inputArray));
    }

    public static void main(String[] args) {
        moveZerosToEnd(new int[] {12, 0, 7, 0, 8, 0, 3});
        moveZerosToEnd(new int[] {1, -5, 0, 0, 8, 0, 1});
        moveZerosToFront(new int[] {0, 1, 0, 1, -5, 0, 4});
        moveZerosToFront(new int[] {-4, 1, 0, 0, 2, 21, 4});
    }

}
