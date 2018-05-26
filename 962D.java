import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		long[] array = new long[n];
		st = new StringTokenizer(br.readLine());

		HashMap<Long, PriorityQueue<Long>> numPos = new HashMap<>();

		for (int i = 0; i < n; i++) {
			array[i] = Long.parseLong(st.nextToken());
			if (numPos.containsKey(array[i])) {
				numPos.get(array[i]).add((long) i);
				// tmpQue = numPos.get(array[i]);
			} else {
				PriorityQueue<Long> tmpQue = new PriorityQueue<Long>();
				tmpQue.add((long) i);
				numPos.put(array[i], tmpQue);
			}

		}
		// System.out.println(numPos);

		TreeSet<Long> firstPosSet = new TreeSet<>();
		for (Long num : numPos.keySet()) {
			if (numPos.get(num).size() >= 2) {
				firstPosSet.add(num);
			}

		}

		while (!firstPosSet.isEmpty()) {
			// System.out.println(numPos);
			// System.out.println(firstPosSet);
			// System.out.println(Arrays.toString(array));
			long topNum = firstPosSet.first();
			long firstPos = numPos.get(topNum).peek();

			array[(int) firstPos] = -1;

			// update old number
			PriorityQueue<Long> oldNumQue = numPos.get(topNum);
			oldNumQue.poll();
			long secPos = oldNumQue.poll();
			if (oldNumQue.size() < 2) {
				firstPosSet.remove(topNum);
			}

			// update new number
			long newNum = topNum * 2;
			array[(int) secPos] = newNum;

			if (numPos.containsKey(newNum)) {
				numPos.get(newNum).add(secPos);
			} else {
				PriorityQueue<Long> tmp = new PriorityQueue<Long>();
				tmp.add(secPos);
				numPos.put(newNum, tmp);
			}
			if (numPos.get(newNum).size() >= 2)
				firstPosSet.add(newNum);

		}
		StringBuilder sb = new StringBuilder("");
		int cnt = 0;
		for (Long num : array) {
			if (num != -1) {
				cnt++;
				sb.append(num);
				sb.append(" ");
			}
		}
		System.out.println(cnt);
		System.out.println(sb.toString().trim());
		// System.out.println(Arrays.toString(array));
	}
}