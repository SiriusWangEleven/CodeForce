import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		ArrayList<Integer> ans = new ArrayList<>();
		for (int i = Math.max(1, n - getDigNum(n) * 9); i <= n; i++) {
			if( i + getSum(i) == n){
				ans.add(i);
			}
		}
		System.out.println(ans.size());
		
		for(int i=0;i<ans.size();i++){
			System.out.println(ans.get(i));
		}
		
	}

	public static int getDigNum(int n) {
		int cnt = 0;
		while (n > 0) {
			n /= 10;
			cnt++;
		}
		return cnt;
	}

	public static int getSum(int n) {
		int cnt = 0;
		while (n > 0) {
			cnt += n % 10;
			n /= 10;
		}
		return cnt;
	}
}