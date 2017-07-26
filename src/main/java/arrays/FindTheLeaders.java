package arrays;

import java.util.ArrayList;

/*
Given an integer array, you have to find all the leader elements in this array. An element is said to be leader
if all the elements on it’s right side are smaller than it. Rightmost element is always a leader
Logic Used To Find All The Leaders In An Integer Array :

We go on traversing the given array from right to left. Initially, we assume the last element as highest and we store
it in a variable called ‘max‘. We print the last element as it is always a leader. If we find any element greater than
‘max‘, we print that element and update the ‘max‘ variable. We continue this until we traverse all the elements in
the given array.
 */
public class FindTheLeaders {

    static void findTheLeaders1(int inputArray[]) {
        ArrayList<Integer> leaders = new ArrayList<>();
        int max = inputArray[inputArray.length - 1];
        leaders.add(max);
        for (int i = inputArray.length - 2; i >= 0; i--) {
            if (inputArray[i] > max) {
                max = inputArray[i];
                leaders.add(max);
            }
        }

        System.out.println(leaders);
    }

    static void findTheLeaders2(int inputArray[]) {
        ArrayList<Integer> leaders = new ArrayList<>();
        for (int i = 0; i < inputArray.length; i++) {
            boolean flag = true;
            for (int j = i + 1; j < inputArray.length; j++) {
                if (inputArray[j] > inputArray[i]) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                leaders.add(inputArray[i]);
            }
        }

        System.out.println(leaders);
    }

    public static void main(String[] args) {
        findTheLeaders1(new int[] {12, 9, 7, 14, 8, 6, 3});
        findTheLeaders1(new int[] {8, 23, 19, 21, 15, 6, 11});
        findTheLeaders2(new int[] {55, 67, 71, 57, 51, 63, 38});
        findTheLeaders2(new int[] {21, 58, 44, 14, 51, 36, 23});
    }

}
