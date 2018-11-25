package sort;

import java.util.Arrays;
import java.util.Random;

public class MergeSort {

	public static int[] sort(int[] array) {
		if (array.length == 1) {
			return array;
		} else {
			return merge (sort(Arrays.copyOfRange(array, 0, array.length / 2)),
				sort(Arrays.copyOfRange(array, array.length / 2, array.length)));
		}
	}
	
	public static int[] merge(int[] arrayA, int[] arrayB) {
		int[] result = new int[arrayA.length + arrayB.length];
		int indexT = 0;
		int indexA = 0;
		int indexB = 0;
		for (int i = 0; i <= arrayA.length + arrayB.length; i++) {
			if (arrayA[indexA] < arrayB[indexB]) {
				result[indexT] = arrayA[indexA];
				indexA += 1;
			} else {
				result[indexT] = arrayB[indexB];
				indexB += 1;
			}
			indexT += 1;
		}
		return result;
	}
	
	public static void main(String[] args) {
		
		int[] alist = sort({4312,4,54,5346,5,76,5,45});
		System.out.println(alist);
	}

}