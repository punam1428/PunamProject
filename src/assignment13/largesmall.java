package assignment13;

public class largesmall {

	public static void main(String[] args) {

		int[] arr = { 1, 5, 2, 6, 9, 7 };

		int smallestno = arr[0];
		int largestno = arr[0];

		for (int i = 1; i < arr.length; i++) {

			if (arr[i] > largestno) {
				largestno = arr[i];
			} else if (arr[i] < smallestno) {
				smallestno = arr[i];
			}
		}
		System.out.println("smallest number is   " + smallestno);
		System.out.println("largest number is   " + largestno);
	}

}
