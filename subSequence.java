package RECURSION;

public class subSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String que = ("abc");
		subseq(que, "");
	}

	public static void subseq(String que, String ans) {
		if (que.length() == 0) {
			System.out.println (ans + "");
			return;
		}
		char ch = que.charAt(0);
		subseq(que.substring(1), ans);
		subseq(que.substring(1), ans + ch);

	}
}
