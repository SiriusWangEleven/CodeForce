import java.util.Scanner;

public class Main {

	StringBuffer S;
	StringBuffer T;
	int tLen;
	int sLen;
	int[] next;
	int numOfMatch;

	public Main(String s, String t) {
		S = new StringBuffer('#' + s);
		T = new StringBuffer('#' + t);
		tLen = t.length();
		sLen = s.length();
		next = new int[tLen + 10];
		numOfMatch = 0;
	}

	void getNext() {
		int i = 1;
		int j = 0;
		next[1] = 0;
		while (i <= tLen) {
			if (j == 0 || T.charAt(i) == T.charAt(j)) {
				++i;
				++j;
				next[i] = j;
				// System.out.println("i==" + i + ",j==" + j + "   next[" + i +
				// "] = " + j);
			} else {
				// System.out.print("next[" + j + "] = " + next[j]);
				j = next[j];
				// System.out.println(", j ==" + j);
			}

		}
		// System.out.println(Arrays.toString(next));
	}

	int match() {
		getNext();
		int i = 1, j = 1;
		while (i <= sLen) {
			while (i <= sLen && j <= tLen) {
				if (j == 0 || S.charAt(i) == T.charAt(j)) {
					++i;
					++j;
				} else
					j = next[j];
			}
			if (j > tLen) {
				j = 1;

				numOfMatch++;
			}
		}

		return numOfMatch;
	}

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) throws Exception {

		String s = in.nextLine();
		String sub = in.nextLine();
		Main kmp = new Main(s, sub);
		kmp.match();
		System.out.println(kmp.numOfMatch);
	}
}