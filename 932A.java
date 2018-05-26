import java.util.Scanner;

public class Main {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		String a = in.next();
		String b = a;
		StringBuilder sb = new StringBuilder(b);
		sb.reverse();
		sb.append(a);
		System.out.println(sb.toString());
	}

}