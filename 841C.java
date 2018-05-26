import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	static Scanner in = new Scanner(System.in);

	static class ArrayB {
		int id, b;

		public ArrayB(int id, int b) {
			this.id = id;
			this.b = b;
		}
	}

	static Comparator<ArrayB> cmp = new Comparator<Main.ArrayB>() {
		public int compare(ArrayB o1, ArrayB o2) {
			return o1.b - o2.b;
		}
	};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());

		int[] arrayA = new int[n];
		int[] ansA = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++)
			arrayA[i] = Integer.parseInt(st.nextToken());

		ArrayList<ArrayB> list = new ArrayList<>();
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			int b = Integer.parseInt(st.nextToken());
			list.add(new ArrayB(i, b));
		}

		Arrays.sort(arrayA);
		list.sort(cmp);
		for (int i = 0; i < n; i++) {
			int id = list.get(i).id;
			ansA[id] = arrayA[n - 1 - i];
		}
		System.out.print(ansA[0]);
		for (int i = 1; i < n; i++)
			System.out.print(" " + ansA[i]);
		System.out.println();

	}
}