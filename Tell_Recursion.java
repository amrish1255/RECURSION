package RECURSION;

public class Tell_Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		System.out.println(fact(n, 1));

	}

	public static int fact(int n, int ans) {
		if (n == 1) {
			return ans;
		}
		return fact(n - 1, ans * n);

	}

}
