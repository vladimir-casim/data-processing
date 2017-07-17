package liangintro.sorting.ex_23_03;



import liangintro.abstracts.examples.shape.Rectangle;
import liangintro.abstracts.examples.sortrectangles.ComparableRectangle;

import java.util.Comparator;

/**
 * Generic quick sort) Write two generic methods using quick sort.
 * The first method sorts the elements using the Comparable interface and the
 * second uses the Comparator interface.
 *
 * Created by Vladimir
 */

public class Exercise_23_02 {

    public static <E extends Comparable<E>> void quickSort(E[] list) {
        quickSort(list, 0, list.length - 1);
    }

    public static <E extends Comparable<E>> void quickSort(E[] list, int first, int last) {
        if (last > first) {
            int pivotIndex = partition(list, first, last);
            quickSort(list, first, pivotIndex - 1);
            quickSort(list, pivotIndex + 1, last);
        }
    }

    public static <E extends Comparable<E>> int partition(E[] list, int first, int last) {
        E pivot = list[first];
        int low = first + 1;
        int high = last;

        while (high > low) {
            while (low <= high && list[low].compareTo(pivot) <= 0)
                low++;

            while (low <= high && list[high].compareTo(pivot) == 1)
                high--;

            if (high > low) {
                E temp = list[high];
                list[high] = list[low];
                list[low] = temp;
            }
        }

        while (high > first && list[high].compareTo(pivot) >= 0)
            high--;

        if (list[high].compareTo(pivot) == -1) {
            list[first] = list[high];
            list[high] = pivot;
            return high;
        } else {
            return first;
        }
    }

    public static <E> void quickSort(E[] list,  Comparator<? super E> comparator) {

    }

    public static void main(String[] args) {
        ComparableRectangle[] rectangles = {
                new ComparableRectangle(3.4, 5.4),
                new ComparableRectangle(13.24, 55.4),
                new ComparableRectangle(7.4, 35.4),
                new ComparableRectangle(1.4, 25.4)
        };

        quickSort(rectangles);

        for (Rectangle rectangle: rectangles) {
            System.out.println(rectangle.getArea());
        }
    }

}
