package lv2;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Q42586 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int[] solution(int[] progresses, int[] speeds) {
		Stack<Integer> stack = new Stack<Integer>();

		for (int i = progresses.length - 1; i >= 0; i--)
			stack.add((100 - progresses[i]) / speeds[i] + ((100 - progresses[i]) % speeds[i] > 0 ? 1 : 0));
		
		List<Integer> s = new ArrayList<Integer>();
		while (!stack.isEmpty()) {
			int cnt = 1;
			int top = stack.pop();

			while (!stack.isEmpty() && stack.peek() <= top) {
				cnt++;
				stack.pop();
			}
			s.add(cnt);
		}
		
		int[] answer = new int[s.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = s.get(i);
		}
		return answer;
	}
}