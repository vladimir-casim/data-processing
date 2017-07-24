package common;

import java.util.Scanner;

public class NumberPatternPrograms {

    /*
    1
    1 2
    1 2 3
    1 2 3 4
     */
    static void pattern1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many rows you want in this pattern?");
        int rows = sc.nextInt();

        for (int i = 1; i <= rows; i++) {
            System.out.println();
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
        }
    }

    /*
    1
    2 2
    3 3 3
    4 4 4 4
     */
    static void pattern2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many rows you want in this pattern?");
        int rows = scanner.nextInt();

        for (int i = 1; i <= rows; i++) {
            System.out.println();
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
        }
    }

    /*
    1
    1 2
    1 2 3
    1 2 3 4
    1 2 3
    1 2
    1
     */
    static void pattern3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many rows you want in this pattern?");
        int rows = scanner.nextInt();


    }

    public static void main(String[] args) {
        //pattern1();
        //pattern2();
        pattern3();
    }

}
