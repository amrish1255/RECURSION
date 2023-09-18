package Recursion_Practic;

public class numnber_print2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		num(n);
	}

	public static void num(int n) {
		// TODO Auto-generated method stub
	if(n==0) {
		return ;
	}
	num(n-1);
	System.out.println(n);
	}

}
