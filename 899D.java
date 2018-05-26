import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.valueOf(st.nextToken());
		int sum = n + n - 1;
		// System.out.println("sum==" + sum);
		if (checkAllNine(sum) || sum == 9) {
			System.out.println(1);
			return;
		}
		if (sum < 9) {
			System.out.println(n * (n - 1) / 2);
			return;
		}

		//

		long ans = 0;

		// len >= 2
		int len = cntLen(sum);
		int left = sum / (int) (Math.pow(10, len - 1));

		int firstNum = getFirst(sum, len, left);

		len = cntLen(firstNum);
		int loop = (int) (Math.pow(10, len - 1));
		left = firstNum / (int) (Math.pow(10, len - 1));
		if (firstNum < 10)
			left = 0;
		if (left == 9) {
			if (firstNum <= n)
				System.out.println(firstNum / 2);
			else {
				System.out.println(n - firstNum / 2);
			}
			return;
		}
		// System.out.println("left==" + left);
		while (left >= 0) {
			// System.out.println("firstNum==" + firstNum);
			if (firstNum > n) {
				int half = firstNum / 2 + 1;
				ans += (n - half + 1);
			}

			else
				ans += firstNum / 2;
			// System.out.println("ans==" + ans);
			firstNum -= loop;
			left--;
		}
		System.out.println(ans);
	}

	public static int getFirst(int sum, int len, int left) {
		int firstNum = -1;
		int rightSum = 0;

		for (int i = 0; i < len - 1; i++) {
			rightSum *= 10;
			rightSum += 9;
		}
		if (sum % (int) (Math.pow(10, len - 1)) != rightSum)
			left--;
		// System.out.println("rightSum==" + rightSum);
		firstNum = left * (int) (Math.pow(10, len - 1)) + rightSum;
		// System.out.println("firstNum==" + firstNum);
		// System.out.println();
		return firstNum;
	}

	public static int cntLen(int n) {
		int i = 0;
		while (n != 0) {
			i++;
			n /= 10;
		}
		return i;
	}

	public static boolean checkAllNine(int n) {
		while (n != 0) {
			if (n % 9 != 0)
				return false;
			n /= 10;
		}
		return true;
	}

	public static void printArray(int a[], int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

}