package _004_quicksort;

import java.util.Random;

public class quickSort {

	public static void main(String[] args) {

		int[] array = new int[9];

		randomFill(array);
		printArray(array);
		quickSort(array);
		printArray(array);

	}

	public static void quickSort(int array[]) {

		_quickSort(0, array.length - 1, array);
	}

	private static void _quickSort(int kleinerIndex, int groeßerIndex, int[] array) {
		if (kleinerIndex >= groeßerIndex) { // instant Abbruch
			return;
		}

		int i = kleinerIndex;
		int k = groeßerIndex - 1;
		int pivot = array[groeßerIndex];

		do {
			while (array[i] <= pivot && i < groeßerIndex) { // klIndex wirklich kleiner als Pivot->rücke vor in Mitte

				i++;
			}
			while (array[k] >= pivot && k > kleinerIndex) { // grIndex wirklich größer als Pivot -> rücke vor in mitte

				k--;
			}
			if (i < k) { // wenn klIndexWert < grIndexWert
				int temp = array[i]; // setze temp auf Wert von von array stelle i
				array[i] = array[k]; // i wird auf wert von k gesetzt
				array[k] = temp; // k erhält wert von temp
			}
		} while (i < k); 				// wenn klIndex < grIndex
		if (array[i] > pivot) { 		// wenn Wert von klIndex > Pivot
			int temp = array[i]; 		// setze temp mit wert von klpflIndex

			array[i] = array[groeßerIndex]; // ersetze klpflindexwert mit grpflindexwert
			array[groeßerIndex] = temp; // grpflindexwert wird durch temp ersetzt
		}
		_quickSort(kleinerIndex, i - 1, array);
		_quickSort(i + 1, groeßerIndex, array);
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
