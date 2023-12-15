package RECURSION;

public class arraySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 4, 3, 4, 7, 2, 5, 3, 8, 11 };
		int item = 4;
		search(arr, item, 0);
		System.out.println(search(arr, item, 0));

	}

	public static int search(int[] arr, int item, int i) {
		if (i == arr.length - 1) {
			return -1;
		}
		if (arr[i] == item) {
			return i;
		}

		return search(arr, item, i + 1);

	}

}
