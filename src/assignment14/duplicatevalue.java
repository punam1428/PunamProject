package assignment14;

public class duplicatevalue {

	public static void main(String[] args) {
		int[] arr = { 1, 5, 1, 6, 5, 7, 4, 4 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {

					System.out.println(arr[j]);
				}

			}

		}

	}

}
