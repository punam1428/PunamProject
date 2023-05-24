package assignment12;

public class evenodd {

	public static void main(String[] args) {
		int[] arr = {2,4,3,6,9,8};
		
		for(int currNo :arr) {
			if(currNo %2==0) {
				System.out.println(currNo +"number is even");
			}
			else {
				
				System.out.println(currNo +"number is odd");
			}
		}

	}

}
