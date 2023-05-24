package assignment9;

public class sumarray {

	public static void main(String[] args) {
		int[] arr = {3,3,2,1,2,2};
		
		int sum=0;
		
		for(int currNo :arr) {
			sum=sum+currNo;
		}
		
		System.out.println("sum: " + sum);
	}

}
