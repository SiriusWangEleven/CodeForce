import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.next();
		in.close();
		int cnt = 0;
		int left = 0, right = 0;

		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)=='A'){
				left = cntQ(str, 0, i);
				right = cntQ(str, i+1, str.length());
				cnt += (left*right);
			}
		}
		System.out.println(cnt);

	}

	public static int cntQ(String str, int left, int right) {
		int cnt = 0;
		for (int i = left; i < right; i++) {
			if (str.charAt(i) == 'Q')
				cnt++;
		}
		return cnt;
	}

}