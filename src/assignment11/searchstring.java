package assignment11;

public class searchstring {

	public static void main(String[] args) {

		String[] arr = { "punam", "priya", "pradeep", "prisha" };

		String searchstring = "priya";
		String result = searchstring + "  do not exist in given array";
		for (String currNo : arr) {
			if (currNo == searchstring) {
				result = searchstring + "    exist in given array";
			}
		}
		System.out.println(result);
	}

}
