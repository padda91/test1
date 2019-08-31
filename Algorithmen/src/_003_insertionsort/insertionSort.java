package _003_insertionsort;

import java.util.Random;

public class insertionSort {

	public static void main(String[] args) {

		int[] array = new int[6];

		randomFill(array);
		printArray(array);
		insertionSort(array);
		printArray(array);

	}

	public static void insertionSort(int array[]) {
		for (int i = 1; i < array.length; i++) {
			int valueToSort = array[i];
			int k = i;
			while (k > 0 && array[k - 1] > valueToSort) {
				array[k] = array[k - 1];
				k--;
			}
			array[k] = valueToSort;
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
