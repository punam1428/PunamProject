package assignment10;

import java.util.Scanner;

public class searcharray {

	public static void main(String[] args) {
		int[] arr = { 3, 3, 2, 1, 2, 2 };
		Scanner reader = new Scanner(System.in);
		System.out.println("Please Enter String");

		int input = reader.nextInt();

		//int searchno = 0;
		String result = input + "do not exist in given array";
		for (int currNo : arr) {
			if (currNo == input) {
				result = input + "exist in given array";
			}
		}
		System.out.println(result);
	}

}
