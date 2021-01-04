

public class AddArrayElements {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5, 6, 7, 9, 10, 8 };
		int target = 11;
		try {
			for (int i = 0; i <= array.length - 1; i++) {
				for (int j = 0; j <= array.length - 1; j++) {
					if (target == array[i] + array[j]) {
						System.out.println("The indices of element are " + i + " " + j + " elements are " + array[i]
								+ " " + array[j]);
					} else
						continue;
				}
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("index out of bounds exception");
		}
	}

}
