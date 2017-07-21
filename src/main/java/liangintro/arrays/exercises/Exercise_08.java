package liangintro.arrays.exercises;

/*
(Average an array) Write two overloaded methods that return the average of an
array with the following headers:
public static int average(int[] array)
public static double average(double[] array)
Write a test program that prompts the user to enter ten double values, invokes this
method, and displays the average valu
*/
public class Exercise_08 {

	public static void main(String[] args) {
		
		double[] listDouble = {1.0, 4.0, 6.0, 3.0, 10.0};
		int[] listInt = {3, 5, 8, 9, 7};
		
		System.out.println(average(listDouble));
		System.out.println(average(listInt));
	}
	
	public static int average(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum = array[i] + sum;
		}
		return sum / array.length;
	}
	
	public static double average(double[] array) {
		double sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum = array[i] + sum;
		}
		return sum / array.length;
	}

}
