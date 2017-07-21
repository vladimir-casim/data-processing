package arrays;

/*
Write a java program to find second largest number in an integer array?

check the logical ability
First, we compare the first two elements of the given array. The largest among these two elements will be assigned to
‘firstLargest‘ and smallest will be assigned to ‘secondLargest‘. We iterate the remaining elements through for loop.
If any element of the remaining elements is greater than the ‘firstLargest‘, then we assign that element to ‘firstLargest‘
and current value of ‘firstLargest‘ will be assigned to ‘secondLargest‘. If any element is smaller than ‘firstLargest‘
and greater than ‘secondLargest‘, then we assign that element to ‘secondLargest‘.
*/
public class SecondLargestNumber {

    static int secondLargest(int[] input) {
        int firstLargest = 0;
        int secondlargest = 0;

        if (input[0] > input[1]) {
            firstLargest = input[0];
            secondlargest = input[1];
        } else {
            firstLargest = input[1];
            secondlargest = input[0];
        }

        for (int i = 2; i < input.length; i++) {
            if (input[i] > firstLargest) {
                secondlargest = firstLargest;
                firstLargest = input[i];
            } else if (input[i] > secondlargest && input[i] < firstLargest) {
                secondlargest = input[i];
            }
        }

        return secondlargest;
    }

    public static void main(String[] args) {
        System.out.println(secondLargest(new int[] {45, 51, 28, 75, 49, 42}));
        System.out.println(secondLargest(new int[] {985, 521, 975, 831, 479, 861}));
        System.out.println(secondLargest(new int[] {9459, 9575, 5692, 1305, 1942, 9012}));
        System.out.println(secondLargest(new int[] {47498, 14526, 74562, 42681, 75283, 45796}));
    }

}
