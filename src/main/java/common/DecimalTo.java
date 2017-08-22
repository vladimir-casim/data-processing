package common;

import java.util.Scanner;

public class DecimalTo {

    static void decimalToBinary() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Decimal Number : ");
        int inputNumber = sc.nextInt();

        String binary = "";
        int rem = 0;

        while (inputNumber > 0)
        {
            rem = inputNumber%2;
            binary =  rem + binary;
            inputNumber = inputNumber/2;
        }
    }

    static void decimalToOctal() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Decimal Number : ");
        int inputNumber = sc.nextInt();

        String octal = "";
        int rem = 0;

        while (inputNumber > 0)
        {
            rem = inputNumber%8;
            octal =  rem + octal;
            inputNumber = inputNumber/8;
        }
    }

    static void decimalToHexaDecimal() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Decimal Number : ");
        int inputNumber = sc.nextInt();

        String hexa = "";
        int rem = 0;
        char hexaDecimals[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

        while (inputNumber > 0)
        {
            rem = inputNumber%16;
            hexa =  hexaDecimals[rem] + hexa;
            inputNumber = inputNumber/16;
        }

    }

    public static void main(String[] args) {
        decimalToBinary();
        decimalToOctal();
        decimalToHexaDecimal();
    }
}
