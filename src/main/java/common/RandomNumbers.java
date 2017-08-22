package common;

import java.util.Random;

/**
 * Example of random generated numbers
 *
 * Created by Vladimir
 */

public class RandomNumbers {

    public static void main(String[] args) {
        //range from min till max
        int min = 5;
        int max = 10;
        int randomNumber;

        // Math.random() generates a double value in the range [0,1)
        // (int) truncate the decimal part
        randomNumber = min + (int)(Math.random() * ((max - min) + 1));
        System.out.println(randomNumber);

        Random rand = new Random(100);

        // nextInt is normally exclusive of the top value,
        // so add 1 to make it inclusive
        randomNumber = rand.nextInt((max - min) + 1) + min;
        System.out.println(randomNumber);

        randomNumber = rand.nextInt(max);
        System.out.println(randomNumber);


    }

}
