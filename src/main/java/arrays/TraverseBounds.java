package arrays;

public class TraverseBounds {

    public static void main(String[] args) {
        int[][] arr = new int[][] {
                {43, 8, 5, 11},
                {19, 6, 7, 98},
                {41, 9, 10, 23},
                {92, 65, 3, 12},
                {32, 51, 87, 34}
        };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == 0 || i == arr.length - 1) {
                    System.out.println("first row: " + arr[i][j]);
                } else {
                    if (j == 0 || j == (arr[i].length - 1))
                    System.out.println(arr[i][j]);
                }
            }

        }

    }

}
