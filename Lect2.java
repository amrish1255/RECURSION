package RECURSION;

public class Lect2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		PD(n);
//		PI(n);

	}

	public static void PD(int n) {
		if (n == 0) {
			return ;
		}
		PD(n-1);
		System.out.println(n);
		

	}
//	public static void PI(int n) {
//		if(n==0) {
//			return;
//			
//		}
//		System.out.println(n);
//		PI(n-1);
//	
//	}

}
