package Recursion_Practic;

public class power_using_Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 4;
		int b = 3;
		System.out.println(pow(a, b));

	}

	public static int pow(int a, int b) {
		// power of a
		if (b == 0) {
			return 1;
		}
		int ans = pow(a, b - 1);// b-1 is base case
		return ans * a;
	}

}

