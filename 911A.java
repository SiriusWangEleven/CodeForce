import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		int n = in.nextInt();
		TreeMap<Integer, ArrayList<Integer>> treeMap = new TreeMap<>();
		for (int i = 0; i < n; i++) {
			int tmp = in.nextInt();
			if (treeMap.containsKey(tmp)) {
				treeMap.get(tmp).add(i);
			} else {
				ArrayList<Integer> list = new ArrayList<>();
				list.add(i);
				treeMap.put(tmp, list);
			}
		}
		ArrayList<Integer> list = null;
		for (Integer i : treeMap.keySet()) {
			if (treeMap.get(i).size() > 1) {
				list = treeMap.get(i);
				break;
			}
		}
		int gap = Integer.MAX_VALUE;
		for (int i = 1; i < list.size(); i++) {
			gap = Math.min(gap, list.get(i) - list.get(i - 1));
		}
		System.out.println(gap);
	}

}