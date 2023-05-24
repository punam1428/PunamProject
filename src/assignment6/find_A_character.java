package assignment6;

public class find_A_character {

	public static void main(String[] args) {
		
		String str = "Poonam";
		
		int count=0;
		
		for(int i=0; i<str.length(); i++) {
			
			if (str.charAt(i)=='o') {
				count++;
			}
		}
		System.out.println(" character at " + count + "st Position");
	}

}
