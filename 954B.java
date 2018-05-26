import java.util.Scanner;
import java.util.Stack;

public class Main {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		int n = in.nextInt();
		String move = in.next();

		int maxSubLen = getDoubleString(move);
		System.out.println(move.length() - maxSubLen + 1);

	}

	static int getDoubleString(String move) {
		int tmpMax = 1;
		int len = move.length();
		int i = 0;
		for (int j = i + 1; j < len; j++) {
			int subLen = j - i;
			String sub1 = move.substring(i, j);
			if (j + subLen <= len) {
				String sub2 = move.substring(j, j + subLen);
				if (sub1.compareTo(sub2) == 0 && subLen > tmpMax)
					tmpMax = subLen;
			}
		}

//		System.out.println("tmpMax==" + tmpMax);
		return tmpMax;
	}
}