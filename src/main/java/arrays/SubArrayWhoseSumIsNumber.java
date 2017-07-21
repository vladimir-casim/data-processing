package arrays;

/*
Find The Continuous Sub Array In An Array Whose Sum Is Equal To Given Number?
You have given an integer array and a number. You need to find the continuous sub array of the given array whose sum is equal to
given number. For example, If {12, 5, 31, 9, 21, 8} is the given array and 45 is the given number, then you have to find
continuous sub array in this array such that whose elements add up to 45. In this case, {5, 31, 9}
is such sub array whose elements add up to 45.

Let inputArray be the given integer array and inputNumber be the given number. First we initialize the sum
to first element of the inputArray. Starting from the second element, we go on adding each element of
inputArray to sum one by one. If the sum exceeds the inputNumber then we remove starting elements from
the sum until sum becomes either smaller than the inputNumber or equal to inputNumber. If sum becomes
equal to inputNumber then we print that sub array. If sum becomes smaller than inputNumber, then we
continue the execution of loop.
 */

import java.util.Arrays;

public class SubArrayWhoseSumIsNumber {

    static void findSubArray(int[] inputArray, int inputNumber) {
        int sum = inputArray[0];
        int start = 0;
        for (int i = 1; i < inputArray.length; i++) {
            sum = sum + inputArray[i];

            /*
                If sum is greater than inputNumber then following loop is executed until
                sum becomes either smaller than or equal to inputNumber
             */

            while(sum > inputNumber && start <= i-1) {
                sum = sum - inputArray[start];
                start++;
            }


            if (sum == inputNumber) {
                System.out.println("Continuous sub array of " + Arrays.toString(inputArray)+" whose sum is " + inputNumber + " is ");
                for (int j = start; j <= i; j++) {
                    System.out.print(inputArray[j] + " ");
                }
                System.out.println();
            }
        }

    }

    public static void main(String[] args) {
        findSubArray(new int[]{42, 15, 12, 8, 6, 32}, 26);
        findSubArray(new int[]{12, 5, 31, 13, 21, 8}, 49);
        findSubArray(new int[]{15, 51, 7, 81, 5, 11, 25}, 41);
    }

}
