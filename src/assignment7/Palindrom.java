package assignment7;
import java.util.Scanner;

public class Palindrom {
	

	public static void main(String[] args) {

boolean isPalindrom = true;

Scanner reader = new Scanner(System.in);

System.out.println("Please Enter String");

String input = reader.nextLine();

for(int i=0; i < input.length()/2;i++) {
	
	if (input.charAt(i) != input.charAt(input.length()- i- 1)) {
		isPalindrom =false;
		
	}
	}
if(isPalindrom) {
	System.out.println("String is Palindrom");
}
else
	System.out.println("String is Not Palindrom");
}
	
}

