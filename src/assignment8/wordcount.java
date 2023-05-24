package assignment8;

import java.util.Scanner;

public class wordcount {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please Enter String");

		String inputString = scanner.nextLine();
		
		int count=0;
		
		char ch[]=new char[inputString.length()];
		for(int i =0; i<inputString.length();i++)
		{
			ch[i]= inputString.charAt(i);
			if((i ==0 && ch[0]!=' ') || ((i>0)&&(ch[i-1]==' ')))
			{
				count++;
			}
		}
		System.out.println("There are" + count + "words");

	}}
	