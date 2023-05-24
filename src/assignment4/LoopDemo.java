package assignment4;

import java.util.Scanner;

//import java.util.Scanner;

public class LoopDemo {

	public static void main(String[] args) {
	Scanner scanner= new Scanner(System.in);
	int num = scanner.nextInt();
	
		for(int counter=1; counter<=10; counter++) {
			System.out.println(num + "*" + counter +"=" +num*counter);
			
			
		}
		scanner.close();

	}

}
