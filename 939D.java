import java.util.Scanner;

public class Main {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		int n = in.nextInt();
		String a = in.next();
		String b = in.next();
		StringBuilder sb1 = new StringBuilder(a);
		StringBuilder sb2 = new StringBuilder(b);

		boolean find = true;

		char achar = ' ';
		char bchar = ' ';

		StringBuilder sb = new StringBuilder("");

		while (find) {
			find = false;
			for (int i = 0; i < n; i++) {
				achar = sb1.charAt(i);
				bchar = sb2.charAt(i);
				if (achar != bchar) {
					find = true;
					sb.append(achar);
					sb.append(bchar);
					break;
				}
			}
			if (find) {
				for (int i = 0; i < n; i++) {
					if (sb1.charAt(i) == achar)
						sb1.setCharAt(i, bchar);
					if (sb2.charAt(i) == achar)
						sb2.setCharAt(i, bchar);
				}
			}

		}

		System.out.println(sb.length() / 2);

		for (int i = 0; i < sb.length() / 2; i++) {
			System.out.println(sb.charAt(i * 2) + " " + sb.charAt(i * 2 + 1));
		}
	}

}