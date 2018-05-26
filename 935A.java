import java.util.Scanner;

public class Main {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		int n = in.nextInt();
		int ans = 1;

		int sqrtn = (int) Math.sqrt(n);

		for (int i = 2; i <= sqrtn; i++)
			if (n % i == 0)
				ans += 2;
		if (sqrtn * sqrtn == n)
			ans -= 1;

		System.out.println(ans);
	}

}