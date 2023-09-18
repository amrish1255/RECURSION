package Recursion_Practic;

public class number_print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		System.out.println(num(n));

	}
	public static int num(int n) {
		if (n == 1) {
			return 1;
		}
		System.out.println(n);

		return num(n - 1);//number print

	}

}
