package assignment4;
import java.util.Scanner;

public class WhileloopDemo {

	public static void main(String[] args) {
	
		Scanner scanner= new Scanner(System.in);
		
		int num = scanner.nextInt();
		
		int counter= 1;//1.declaration
		
		while (counter<=10)//2.condition
			
		{
			System.out.println(num + "*" + counter + "="+(num * counter));//3.body
			counter = counter+1;//4.increment decrement
		}
		scanner.close();

	}

}
