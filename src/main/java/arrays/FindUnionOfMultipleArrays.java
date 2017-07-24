package arrays;

import java.util.Arrays;
import java.util.HashSet;

/*
HashSet, a very important and useful data structure in java collection framework, holds only unique elements.
It doesn’t allow the duplicate elements. We use this simple yet powerful property of HashSet to find union
of multiple arrays. What we do is we create one HashSet object say ‘unionSet‘ and add every element
of each input array into this set. This will ignore all duplicate elements and resultant set
will have only unique elements from all input arrays.
*/
public class FindUnionOfMultipleArrays {

    static void union(int[] ... inputArrays) {
        HashSet<Integer> union = new HashSet<>();
        for (int[] intArray: inputArrays) {
            for (Integer intNumber: intArray) {
                union.add(intNumber);
            }
        }

        System.out.println(union);
    }

    /*
    retainAll() method of HashSet retains only those elements which are common to both the sets (calling set and passed set).
     We use this method to find the intersection of multiple arrays in java.
     What we do is we create one HashSet object for each input array and call retainAll() method of first object by passing second,
     third, fourth….. objects one by one. The resultant set will be the intersection of all input arrays.
    */
    static void intersection(Integer[] ... inputArrays) {
        HashSet<Integer> intersectionSet = new HashSet<>(Arrays.asList(inputArrays[0]));

        for (Integer[] inputArray: inputArrays) {
            HashSet<Integer> set = new HashSet<>(Arrays.asList(inputArray));
            intersectionSet.retainAll(set);
        }

        System.out.println(intersectionSet);
    }

    public static void main(String[] args) {
        int[] inputArray1 = {2, 3, 4, 7, 1};
        int[] inputArray2 = {4, 1, 3, 5};
        int[] inputArray3 = {8, 4, 6, 2, 1};
        int[] inputArray4 = {7, 9, 4, 1};
        union(inputArray1, inputArray2, inputArray3, inputArray4);

        Integer[] inputArray5 = {2, 3, 4, 7, 1};
        Integer[] inputArray6 = {4, 1, 3, 5};
        Integer[] inputArray7 = {8, 4, 6, 2, 1};
        Integer[] inputArray8 = {7, 9, 4, 1};
        intersection(inputArray5, inputArray6, inputArray7, inputArray8);
    }

}
