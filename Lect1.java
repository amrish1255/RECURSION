package RECURSION;
//factorial program
public class Lect1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5;
		System.out.println(fact(n));

	}

	public static int fact(int n) {
//	Base Case	
		if (n == 1) {
			return 1;
		}
		int fn = fact(n - 1); // smaller problem;(head recursion)
		return n*(fact(n-1));//head recursion
		

	}

}
