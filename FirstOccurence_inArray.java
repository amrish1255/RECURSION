package RECURSION;

public class FirstOccurence_inArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 2, 3, 4,5 };
		
		System.out.println(firstOccurance(arr, 0,5 ));

	}

	public static int firstOccurance(int arr[], int i, int key) {
		// base case
	
		if (i == arr.length) {
			return 0;
			
		}
		if (arr[i] == key) {
			return i;

		}
		return firstOccurance(arr,i+1,key);

	}

}
