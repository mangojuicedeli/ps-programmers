package lv1;

public class Q12931 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int solution(int n) {
		int answer = 0;

		while (n != 0) {
			answer += n % 10;
			n /= 10;
		}

		return answer;
	}
}
