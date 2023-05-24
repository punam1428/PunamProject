package assignment4;

import java.util.Scanner;

public class DowhileloopDemo {

	
		public static void main(String[] args) {
			
			Scanner scanner= new Scanner(System.in);
			
			int num = scanner.nextInt();
			
			int counter= 1;//1.declaration 
			
			do {
				
				System.out.println(num + "*" + counter + "="+(num * counter));//2.body
				counter = counter+1;//3.increment,decrement
				
			}
			while (counter<=10);//4.condition
			scanner.close();
	}

}
