import java.util.Scanner;
import java.util.Stack;

public class Main {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		int n = in.nextInt();
		String move = in.next();
		Stack<Character> stack = new Stack<>();

		stack.push(move.charAt(0));
		for (int i = 1; i < n; i++) {
			char now = move.charAt(i);
			if(stack.isEmpty() || stack.peek() == 'D'||now == stack.peek())
				stack.push(now);
			else{
				
				stack.pop();
				stack.push('D');
				
				
			}
		}
		System.out.println(stack.size());

	}
}