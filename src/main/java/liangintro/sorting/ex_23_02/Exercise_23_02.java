package liangintro.sorting.ex_23_02;


import liangintro.abstracts.examples.shape.Rectangle;
import liangintro.abstracts.examples.sortrectangles.ComparableRectangle;

import java.util.Comparator;

/**
 * (Generic merge sort) Write two generic methods using merge sort.
 * The first method sorts the elements using the Comparable interface and the
 * second uses the Comparator interface.
 *
 * Created by Vladimir
 */

public class Exercise_23_02 {

    public static <E extends Comparable<E>> void mergeSort(E[] list) {
        if (list.length > 1) {
            E[] leftHalf = (E[]) new Comparable[list.length / 2];
            System.arraycopy(list, 0, leftHalf, 0, list.length / 2);
            mergeSort(leftHalf);

            int rightHalfLength = list.length - leftHalf.length;
            E[] rightHalf = (E[]) new Comparable[rightHalfLength];
            System.arraycopy(list, list.length / 2, rightHalf, 0, rightHalfLength);
            mergeSort(rightHalf);

            merge(leftHalf, rightHalf, list);
        }
    }

    public static <E extends Comparable<E>> void merge(E[] list1, E[] list2, E[] temp) {
        int current1 = 0;
        int current2 = 0;
        int current3 = 0;

        while (current1 < list1.length && current2 < list2.length) {
            if (list1[current1].compareTo(list2[current2]) == -1) {
                temp[current3++] = list1[current1++];
            } else {
                temp[current3++] = list2[current2++];
            }
        }

        while (current1 < list1.length) {
            temp[current3++] = list1[current1++];
        }

        while (current2 < list2.length) {
            temp[current3++] = list2[current2++];
        }

    }

    public static <E> void mergeSort(E[] list, Comparator<? super E> comparator) {

    }

    public static void main(String[] args) {
        ComparableRectangle[] rectangles = {
                new ComparableRectangle(3.4, 5.4),
                new ComparableRectangle(13.24, 55.4),
                new ComparableRectangle(7.4, 35.4),
                new ComparableRectangle(1.4, 25.4)
        };

        mergeSort(rectangles);

        for (Rectangle rectangle: rectangles) {
            System.out.println(rectangle.getArea());
        }
    }

}
