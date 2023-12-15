package RECURSION;

public class SortedArraycheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// To check the array is sorted or not
		int arr[] = { 1,2,3,4};
		
		System.out.println(issorted(arr,0));

	}

	public static boolean issorted(int arr[], int i) {
		// base case
		if (i == arr.length - 1) {
			return true;
		}
// smaller problem
		if (arr[i] > arr[i + 1]) {
			return false;
		}
		return issorted(arr, i + 1);

	}

}
