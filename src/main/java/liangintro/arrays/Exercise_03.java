package liangintro.arrays;

import java.util.Scanner;

/*
	(Count occurrence of numbers) Write a program that reads the integers between 1
	and 100 and counts the occurrences of each. Assume the input ends with 0.
 */
public class Exercise_03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] numbers = new int[10];
		int[] setOfNumbers;
		
		System.out.println("Enter 10 number between 1 and 100: ");
		
		for (int i = 0; i < 10; i++) {
			numbers[i] = input.nextInt();
		}
		
		for (int i = 0; i < 10; i++) {
			//numbers[i]
		}
	}

}
