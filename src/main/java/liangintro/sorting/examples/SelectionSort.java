package liangintro.sorting.examples;

/**
 for (int i = 0; i < arraylist.length - 1; i++) {
     select the smallest element in arraylist[i..arraylist.length-1];
     swap the smallest with arraylist[i], if necessary;
     arraylist[i] is in its correct position.
     The next iteration applies on arraylist[i+1..arraylist.length-1]
 }
 */

public class SelectionSort {

    public static void selectionSort(double[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            // Find the minimum in the arraylist[i..arraylist.length-1]
            double currentMin = list[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }

            // Swap arraylist[i] with arraylist[currentMinIndex] if necessary
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }

        }
    }

    public static void main(String[] args) {
        double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};
        selectionSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }

}
