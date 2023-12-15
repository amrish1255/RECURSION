package RECURSION;

public class sumOf_Nth_naturalNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5;

		System.out.println(sofNthNaturalnumber(n));
		System.out.println(factorial(n));
		System.out.println(fib(n));

	}

	public static int sofNthNaturalnumber(int n) {
		// base case ;
		if (n == 1) {
			return 1;
		}
		// smaller problem
		return n + sofNthNaturalnumber(n - 1);
		// in case of factorial

	}
	// function call to calculate the factorial of any given number

	public static int factorial(int n) {
		// base case
		if (n == 0) {
			return 1;
		}
		return n * factorial(n - 1);
	}

	// for calculate the fibnocai number
	public static int fib(int n) {
		if (n == 0 || n == 1) {
			return n;
		}

		return fib(n - 1) + fib(n - 2);

	}

}
