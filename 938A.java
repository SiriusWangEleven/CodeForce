import java.util.Scanner;

public class Main {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		int n = in.nextInt();
		String str = in.next();
		StringBuilder sb = new StringBuilder("");

		for (int i = 0; i < n;) {
			if (!isVowel(str.charAt(i))) {
				sb.append(str.charAt(i));
				i++;
			} else {
				int j = i + 1;
				sb.append(str.charAt(i));
				while (j < n) {
					if (isVowel(str.charAt(j)))
						j++;
					else {
						break;
					}
				}
				i = j;
			}
			
		}
		System.out.println(sb.toString());
	}

	static boolean isVowel(char c) {
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
				|| c == 'y')
			return true;

		return false;
	}

}