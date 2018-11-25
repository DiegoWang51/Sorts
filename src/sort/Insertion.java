package sort;

public class Insertion {

	public static int[] sort(int[] array) {
		for (int i = 1; i <= array.length - 1; i++) {
			for (int j = i; j >= 1; j--) {
				if (array[j] > array[j-1]) {
					int temp = array[j];
					array[j] = array[j-1];
					array[j-1] = temp;
				}
			}
		}
		return array;
	}

	public Insertion() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {2, 13, 31, 28};
		array = sort(array);
		for (int i = 0; i < array.length; i++)
			System.out.println(array[i]);

	}

}
