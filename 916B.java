import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.valueOf(st.nextToken());
		int m = Integer.valueOf(st.nextToken());
		Map<String, String> map = new HashMap<String, String>();
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			String ip = st.nextToken();
			map.put(ip, name);
		}
		// System.out.println(map);
		for (int i = 0; i < m; i++) {
			String cmd = br.readLine();
			String ip = cmd.substring(cmd.indexOf(' ') + 1, cmd.indexOf(';'));
			// System.out.println("ip==" + ip);
			String name = map.get(ip);
			// System.out.println("name==" + name);
			System.out.println(cmd + " #" + name);
		}
	}
}