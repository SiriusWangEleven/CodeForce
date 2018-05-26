import java.util.Scanner;

public class Main {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		int n = in.nextInt();
		int[] like = new int[5005];

		for (int i = 0; i < n; i++)
			like[i + 1] = in.nextInt();

		boolean has = false;
		for (int i = 1; i <= n; i++) {
			if(judge(i, like))
			{
				has = true;
				break;
			}
				
		}
		String ans = has?"YES":"NO";
		System.out.println(ans);
	}
	
	static boolean judge(int i, int[] like){
		
		int j = like[i];
		int k = like[j];
		if(i==like[k] && i!=j & i!=k && j!=k){
			return true;
		}
		return false;
	}

}