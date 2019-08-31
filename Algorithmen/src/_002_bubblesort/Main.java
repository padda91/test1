package _002_bubblesort;

import java.lang.reflect.Array;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		int[] array = new int[6];

		randomFill(array);
		printArray(array);
		bubbleSort(array);
		printArray(array);

	}

	public static void bubbleSort(int[] array) {
		boolean changesDone = true;
		for (int i = 0; i < array.length; i++) {
			changesDone = false;
			for (int k = 0; k < array.length - 1 - i; k++) {
				if (array[k] > array[k + 1]) {

					int temp = array[k];
					array[k] = array[k + 1];
					array[k + 1] = temp;
					changesDone = true;
				}
			}

		}
	}

	public static void randomFill(int[] array) {
		Random r = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = r.nextInt(100);
		}
	}

	public static void printArray(int[] array) {
		System.out.print("[");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			if (i < array.length - 1) {
				System.out.print(",");
			}
		}
		System.out.println("]");
	}

}
