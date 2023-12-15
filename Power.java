package RECURSION;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 2;
		int b = 3;
		System.out.println(pow(a, b,0));

	}

	public static int pow(int a, int b ,int ans) {
		if (b == 0) {
			return ans;
		}
//		int ans = pow(a, b - 1);
		

		//		return ans * a;
//		return fact(n - 1, ans * n);
		return pow(a,b-1,ans*a);

	}

}
