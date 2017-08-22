package sort;

import java.util.Arrays;

public class SelectionSort {

    public static void selectionSort(double[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            double currentMin = arr[i];
            int pos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    currentMin = arr[j];
                    pos = j;
                }
            }

            if (pos != i) {
                arr[pos] = arr[i];
                arr[i] = currentMin;
            }
        }
    }

    public static void main(String[] args) {
        double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};
        selectionSort(list);
        System.out.println(Arrays.toString(list));
    }
}
