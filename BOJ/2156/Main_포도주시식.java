/**
* 메모리: 13184 KB, 시간: 112 ms
* 2021.12.02
* by Alub
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	static int N;
	static int[][] dp;

	public static void main(String[] args) {

		// 1. 입력
		initInput();

		// 2. 로직
		drink();

		// 3. 최대값 출력
		System.out.println(Math.max(dp[0][N-1],Math.max(dp[1][N - 1], dp[2][N - 1])));

	}

	// dp[0] = 0번 연속(현재 음료를 마시지 않는 경우)
	// dp[1] = 1번 연속(현재 음료를 마시는 경우)
	// dp[2] = 2번 연속(이전 음료 + 현재 음료)
	private static void drink() {
		
		for(int i=1;i<N;i++) {
			dp[0][i] = Math.max(dp[1][i-1], Math.max(dp[2][i-1], dp[0][i-1]));	// 이전 max
			dp[1][i] = arr[i] + dp[0][i-1];
			dp[2][i] = arr[i] + dp[1][i-1];
		}

	}
	static int[] arr;
	private static void initInput() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			N = Integer.parseInt(br.readLine());
			dp = new int[3][N];
			arr = new int[N];
			for (int i = 0; i < N; i++) {
				arr[i] = Integer.parseInt(br.readLine());
			}
			dp[1][0] = arr[0];
		} catch (NumberFormatException | IOException e) {
		}
	}

}