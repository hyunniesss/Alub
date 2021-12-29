/**
* 메모리: 81044 KB, 시간: 320 ms
* 2021.12.29
* by Alub
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {
		int N = initInput();
		// target = 가장 아래 원판, start, mid, end
		sb.append((int) (Math.pow(2, N)) - 1).append("\n");
		hanoi(N, 1, 2, 3);
		System.out.println(sb.toString());
	}

	// 1 -> 2 -> 3
	private static void hanoi(int target, int start, int mid, int end) {
		if (target == 0) {
			return;
		}
		hanoi(target - 1, start, end, mid); // 1 -> 3 -> 2
		sb.append(start + " " + end).append("\n");
		hanoi(target - 1, mid, start, end); // 2 -> 1 -> 3
	}

	private static int initInput() {

		try {
			return Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
		} catch (NumberFormatException | IOException e) {
		}
		return 0;
	}

}
