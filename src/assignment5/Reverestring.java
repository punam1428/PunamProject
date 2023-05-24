package assignment5;

public class Reverestring {

	public static void main(String[] args) {
		
		String inputString = "Punam";
		String outputString = "";
		
		int lengthOfString = inputString.length();
		
		for(int i = lengthOfString-1; i>=0; i--){
			
			outputString=outputString+inputString.charAt(i);
		}
		System.out.println("Reverse string   "    + outputString);
	}

}
