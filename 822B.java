import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		int sLen = in.nextInt(), tLen = in.nextInt();
		String s = in.next(), t = in.next();
		int noMatch = tLen + 1;
		int id = -1;
		for (int i = 0; i <= tLen - sLen; i++) {
			int tmpNoMatch = 0;
			for (int j = 0; j < sLen; j++) {
				if (s.charAt(j) != t.charAt(i + j))
					tmpNoMatch++;
			}
			if (tmpNoMatch < noMatch) {
				noMatch = tmpNoMatch;
				id = i;
			}
		}

		System.out.println(noMatch);
		if (noMatch == 0)
			return;
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < sLen; i++) {
			if (s.charAt(i) != t.charAt(i + id))
				list.add(i + 1);
		}
		
		for (int i = 0; i < list.size() - 1; i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println(list.get(list.size() - 1));
	}
}