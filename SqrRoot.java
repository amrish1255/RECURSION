package RECURSION;

import java.util.*;

public class SqrRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(sqrRoot(n,1));

	}

	public static int sqrRoot(int n ,int i) {
		// base case
		if (i == n) {
			return 0;
		}

		if (n%i == 0 && i*i==n) {
			return i;
		}
	return sqrRoot(n,i + 1);

		// using for loop
		
		
	}

}
