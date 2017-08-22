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

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        for (int i = rows - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        scanner.close();
    }

    /*
    1 2 3 4
    1 2 3
    1 2
    1
     */
    static void pattern4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many rows you want in this pattern?");
        int rows = scanner.nextInt();

        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    /*
    4 3 2 1
    4 3 2
    4 3
    4
     */
    static void pattern5() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many rows you want in this pattern?");
        int rows = scanner.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = rows; j >= i; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    /*
    4
    4 3
    4 3 2
    4 3 2 1
     */
    static void pattern6() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many rows you want in this pattern?");
        int rows = scanner.nextInt();

        for (int i = rows; i >= 1; i--) {
            for (int j = rows; j >= i; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern6();
    }

}
