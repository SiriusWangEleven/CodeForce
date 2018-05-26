import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// BufferedReader br = new BufferedReader(new
		// InputStreamReader(System.in));
		// StringTokenizer st = new StringTokenizer(br.readLine());
		int n = in.nextInt();
		HashMap<String, Set<String>> map = new HashMap<String, Set<String>>();

		for (int i = 0; i < n; i++) {
			String name = in.next();
			int num = in.nextInt();
			Set<String> phones = new HashSet<String>();
			if (map.containsKey(name)) {
				phones = map.get(name);
			}
			for (int j = 0; j < num; j++) {
				String phone = in.next();
				phones.add(phone);
			}
			map.put(name, phones);
		}
		in.close();

		System.out.println(map.entrySet().size());
		for (Map.Entry<String, Set<String>> entry : map.entrySet()) {
			String name = entry.getKey();
			Set<String> phones = entry.getValue();
			int num_tmp = phones.size();
			int num = num_tmp;
			LinkedList<String> list = new LinkedList<>();
			list.addAll(phones);
			boolean real[] = new boolean[num_tmp + 5];
			Arrays.fill(real, true);

			for (int i = 0; i < list.size(); i++) {
				for (int j = 0; j < list.size(); j++) {
					if (j == i)
						continue;
					if (list.get(j).endsWith(list.get(i))) {
						real[i] = false;
						num--;
						break;
					}
				}
			}
			System.out.print(name + " " + num);
			for (int i = 0; i < list.size(); i++) {
				if (real[i])
					System.out.print(" " + list.get(i));
			}
			System.out.println();

		}

		// System.out.println(map);

	}

	public static void printArray(int a[], int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

}